package com.neuedu.solar.demo;

import com.neuedu.solar.common.CommonFrame;
import com.neuedu.solar.common.FrameUtil;
import com.neuedu.solar.constant.Constant;

import java.awt.*;

/**
 * @author ldamei
 * @date 2019/12/4 15:24
 */
public class MyFrame03 extends CommonFrame {

    int longAxis = 400;  // 半长轴
    int shortAxis = 200;  // 半短轴
    double theta = 0.0;  // 参数theta
    int x;  // x坐标
    int y;  // y坐标
    double speed = 0.1;  // 线速度斜率的改变量

    static Image img = FrameUtil.getImage("03.Earth.png");
    public void paint(Graphics g){
        // 椭圆轨迹
        // x = a * cos(theta)
        // y = b * sin(theta)
        g.drawImage(img,x,y,null);
        x = Constant.FRAME_WIDTH / 2 + (int)(longAxis * Math.cos(theta));
        y = Constant.FRAME_HEIGHT / 2 + (int)(shortAxis * Math.sin(theta));
        theta += speed;
    }

    public static void main(String[] args) {
        new MyFrame03().loadFrame("按照椭圆轨迹运动");
    }
}
