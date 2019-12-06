package com.neuedu.planewar.common;

import com.neuedu.solar.constant.Constant;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author ldamei
 * @date 2019/12/4 14:18
 */
public class CommonFrame extends Frame {
    //在普通方法中设置生成窗口的属性
    public void loadFrame(String title) {
        this.setSize(Constant.FRAME_WIDTH, Constant.FRAME_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setResizable(false);
        this.setTitle(title);
        new MyThread().start();
//        this.setIconImage(FrameUtil.getImage("logo.jpg"));
    }

    /**
     * 实现Java的多线程步骤
     * 1.继承Thread类
     * 2.重写run()方法
     */
    class MyThread extends Thread{
        public void run(){
            //无限调用paint()的业务
            for(;;){
                //调用paint()
                //repaint()方法是外部类MyFrame02中从父类继承过来的，而不是MyThread中的
                repaint();
                //为了让人眼能舒服的识别频率
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //解决图片闪烁的问题，用双缓冲方法解决闪烁的问题
    Image backImg = null;
    @Override
    public void update(Graphics g) {
        if(backImg == null){
            //如果虚拟图片不存在，创建一个和窗口一样大小的图片
            backImg = createImage(Constant.FRAME_WIDTH,Constant.FRAME_HEIGHT);
        }
        //获取到虚拟图片的画笔
        Graphics backg = backImg.getGraphics();
        Color c = backg.getColor();
        backg.setColor(Color.WHITE);
        backg.fillRect(0,0,Constant.FRAME_WIDTH,Constant.FRAME_HEIGHT);
        backg.setColor(c);

        paint(backg);
        g.drawImage(backImg,0,0,null);
    }
}
