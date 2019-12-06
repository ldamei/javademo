package com.neuedu.planewar.entity;

import com.neuedu.planewar.constant.Constant;
import com.neuedu.solar.common.FrameUtil;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * @author ldamei
 * @date 2019/12/6 9:50
 */
public class Plane extends PlaneWarObject {

    public Plane(){}
    public Plane(int x,int y){
        this.x = x;
        this.y = y;
        this.img = FrameUtil.getImage(Constant.IMG_PATH_PRE+"myplane/01.my.png");
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);
        this.speed = 20;
    }
    //构造方法重写
    public Plane(int x,int y,String imgPath){
        this(x,y);
        this.img = com.neuedu.planewar.common.FrameUtil.getImage(imgPath);
    }
    @Override
    public void move() {
        if(left) x -= speed;
        if(up) y -= speed;
        if(right) x += speed;
        if(down) y += speed;
        outOfBounds();
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(img,x,y,null);
        move();
    }

    //使用开关法创建出4个表示方向的boolean变量
    public boolean left,up,right,down;

    //飞机鼠标控制
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_A:
                left = true;
                break;
            case KeyEvent.VK_W:
                up = true;
                break;
            case KeyEvent.VK_D:
                right = true;
                break;
            case KeyEvent.VK_S:
                down = true;
                break;
        }
    }
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_A:
                left = false;
                break;
            case KeyEvent.VK_W:
                up = false;
                break;
            case KeyEvent.VK_D:
                right = false;
                break;
            case KeyEvent.VK_S:
                down = false;
                break;
        }
    }

    //飞机出界判断
    public void outOfBounds(){
        if(x <= 5){
            x = 5;
        }
        if(y <= 30){
            y = 30;
        }
        if(x >= Constant.FRAME_WIDTH - this.width){
            x = Constant.FRAME_WIDTH - this.width;
        }
        if(y >= Constant.FRAME_HEIGHT - this.height){
            y = Constant.FRAME_HEIGHT - this.height;
        }
    }
}
