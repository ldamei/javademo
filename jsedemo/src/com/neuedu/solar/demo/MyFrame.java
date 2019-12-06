package com.neuedu.solar.demo;

import com.neuedu.solar.common.FrameUtil;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * awt：该包中主要包含了Java中生成窗口对象的一些类
 * 在java中如何生成窗口
 * 1.继承Frame类
 * 2.重写paint()
 */
public class MyFrame extends Frame {
    //在构造方法中设置生成窗口的属性
    public MyFrame(){
        //1.设置大小
        this.setSize(1600,1000);
        //2.设置位置
//        this.setLocation(50,50);
        //水平垂直居中
        this.setLocationRelativeTo(null);
        //3.设置可见性（默认不可见）
        this.setVisible(true);
        //4.设置关闭窗口按钮方法的实现（窗口监听器）
        //（1）使用匿名内部类完成抽象类对象的创建，JDK8.0+ lambda表达式 函数式编程
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //（2）内部类
        /*class MyWindowAdapter extends WindowAdapter{
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        }
        MyWindowAdapter myWindowAdapter = new MyWindowAdapter();
        this.addWindowListener(myWindowAdapter);*/
        //5.设置改变窗口大小的方法（默认可以改变）
        this.setResizable(false);
        //6.设置标题
        this.setTitle("Title");
    }

    public static void main(String[] args) {
        MyFrame myframe = new MyFrame();
    }

    // g 画笔对象
    public void paint(Graphics g){
        //画直线
        g.drawLine(200,200,300,100);
        //画矩形
        g.drawRect(300,400,300,300);
        //画圆
        g.drawOval(200,300,300,300);
        //获取系统的默认颜色（借还法）
        Color c = g.getColor();
        //改变画笔颜色
        g.setColor(new Color(255,25,25));
        g.fillOval(300,300,300,300);
        g.setColor(c);
        //画多边形
        int[] xPoints = {100,300,400};
        int[] yPoints = {100,100,400};
        int nPoints = 3;
        g.drawPolygon(xPoints,yPoints,nPoints);
        //画图片
        g.drawImage(FrameUtil.getImage("03.Earth.png"),600,400,null);
    }
}
