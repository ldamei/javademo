package com.neuedu.solar.common;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;

/**
 * 窗口文件中获取静态资源（图片、声音等）的方法
 */
public class FrameUtil {
    public static Image getImage(String imgPath){
        URL u = FrameUtil.class.getClassLoader().getResource(imgPath);
        BufferedImage img = null;
        try{
            img = ImageIO.read(u);
        }catch(Exception e){
            e.printStackTrace();
        }
        return img;
    }
}
