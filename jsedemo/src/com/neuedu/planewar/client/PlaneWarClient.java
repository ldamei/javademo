package com.neuedu.planewar.client;

import com.neuedu.planewar.common.CommonFrame;
import com.neuedu.planewar.common.FrameUtil;
import com.neuedu.planewar.constant.Constant;
import com.neuedu.planewar.entity.Plane;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author ldamei
 * @date 2019/12/6 9:17
 */
public class PlaneWarClient extends CommonFrame {

    public Plane myPlane = new Plane(400,500);

    @Override
    public void loadFrame(String title) {
        super.loadFrame(title);
        this.setIconImage(FrameUtil.getImage(Constant.IMG_PATH_PRE+"myplane/地球.png"));

        //添加鼠标监听器
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                myPlane.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                myPlane.keyReleased(e);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        myPlane.draw(g);
    }

    public static void main(String[] args) {
        new PlaneWarClient().loadFrame("飞机大战项目");
    }
}
