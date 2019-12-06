package com.neuedu.solar.demo;
import com.neuedu.solar.common.CommonFrame;
import com.neuedu.solar.common.FrameUtil;
import java.awt.*;

/**
 * @author ldamei
 * @date 2019/12/4 14:18
 */
public class MyFrame02 extends CommonFrame {

    int x = 100;
    int y = 100;
    int speed = 5;
    public void paint(Graphics g){
        g.drawImage(FrameUtil.getImage("03.Earth.png"),x,y,null);
        x += speed;
        y += speed;
    }
    public static void main(String[] args) {
        new MyFrame02().loadFrame("沿直线运动");
    }
}
