package com.neuedu.solar.entity;

import com.neuedu.solar.common.CommonFrame;
import com.neuedu.solar.common.FrameUtil;

import java.awt.*;

/**
 * @author ldamei
 * @date 2019/12/5 9:52
 */
public class Planet extends CommonFrame {
    int longAxis;  // 半长轴
    int shortAxis;  // 半短轴
    double theta;  // 参数theta
    int x;  // x坐标
    int y;  // y坐标
    double speed;  // 线速度斜率的改变量
    Image img;
    String name;  // 行星名称
    boolean ni;  //是否逆向
    Sun sun;
    int width;
    int height;

    public Planet(Sun sun, String name, Double au, int t, Double e, Image img, boolean ni){}
    public Planet(Sun sun,String name,double AU,int T,double e,String imgPath,boolean ni){
        this.sun = sun;
        this.name = name;
        this.longAxis = getLongAxis(AU);  // AU:1 =>100px
        this.shortAxis = getShortAxis(e);
        this.speed = getSpeed(T);
        this.img = FrameUtil.getImage(imgPath);
        this.ni = ni;
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);
    }

    private double getSpeed(int t) {
        return 150.0 / t *0.1;
    }
    /**
     * 根据天文单位和离心率计算半短轴
     * au 天文单位
     * e 离心率
     * @return 短轴
     */
    private int getShortAxis(double e) {
        return (int) ((this.longAxis * Math.sqrt(1 - Math.pow(e,2))) / 2);
    }
    private int getLongAxis(double au) {
        return (int) (au * 100);
    }

    //Java编程中的设计原则：单一性原则
    //画行星
    public void draw(Graphics g){
        drawTrace(g);
        g.drawImage(img,x,y,null);
        move();
    }
    //画小行星
    public void draw2(Graphics g){
        g.drawImage(img,x,y,null);
        move();
    }
    //画哈雷彗星
    public void draw3(Graphics g){
        g.drawImage(img,x,y,null);
        move2();
    }

    //行星运动轨迹
    public void move(){
        if(ni == true){
            x = sun.x + sun.width / 2 - this.width / 2 + (int)(longAxis * Math.sin(theta));
            y = sun.y + sun.height / 2 - this.height / 2 + (int)(shortAxis * Math.cos(theta));
        }else{
            x = sun.x + sun.width / 2 - this.width / 2 + (int)(longAxis * Math.cos(theta));
            y = sun.y + sun.height / 2 - this.height / 2 + (int)(shortAxis * Math.sin(theta));
        }
        theta += speed;
    }

    //哈雷彗星运动轨迹
    public void move2(){
        x = sun.x + sun.width / 2 - this.width / 2 + (int)(longAxis * Math.sin(theta)) - (int)(shortAxis * Math.cos(theta));
        y = sun.y + sun.height / 2 - this.height / 2 + (int)(shortAxis * Math.cos(theta)) + (int)(longAxis * Math.sin(theta));
        theta += speed;
    }

    //画轨道
    private void drawTrace(Graphics g){
        int x = sun.x + sun.width / 2 - longAxis;
        int y = sun.y + sun.height / 2 - shortAxis;
        int width = 2 * longAxis;
        int height = 2 * shortAxis;
        g.drawOval(x,y,width,height);
        g.drawString(name,this.x,this.y);
    }
}
