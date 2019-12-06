package com.neuedu.solar.client;

import com.neuedu.solar.common.CommonFrame;
import com.neuedu.solar.common.FrameUtil;
import com.neuedu.solar.constant.Constant;
import com.neuedu.solar.entity.Planet;
import com.neuedu.solar.entity.Sun;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SolarSystem extends CommonFrame {
    Sun sun = new Sun();
    Planet mercury = new Planet(sun,"水星",1.127,88,0.2056,"01.Mercury.png",false);
    Planet venus = new Planet(sun,"金星",1.256,225,0.0068,"02.Venus.png",true);
    Planet earth = new Planet(sun,"地球",1.6,365,0.0167, "03.Earth.png",false);
    Planet mars = new Planet(sun,"火星",1.92,687,0.0934, "04.Mars.png",false);
    Planet jupiter = new Planet(sun,"木星", 3.2,4330,0.0489,"05.Jupiter.png",false);
    Planet saturn = new Planet(sun,"土星", 4.54,10832,0.0557,"06.Saturn.png",false);
    Planet uranus = new Planet(sun,"天王星", 6.218,30777,0.0444,"07.Uranus.png",false);
    Planet neptune = new Planet(sun,"海王星", 7.56,60328,0.0112,"08.Neptune.png",false);
    Planet pluto = new Planet(sun,"冥王星", 8.68,90717,0.249,"09.Pluto.png",false);
    Planet huixing = new Planet(sun,"哈雷彗星", 4.68,4200,0.249,"huixing.png",false);

    List<Planet> smallPlanets = new ArrayList<Planet>();
//    static Image img = FrameUtil.getImage("moon.png");
    {
        for(int i = 0; i < 1000;i++){
            Double au =( Math.random() * 1.28) + 1.92;
            int t = (int) (( Math.random() * 3643) + 687);
            Double e =( Math.random() * 0.0445) + 0.0489;
            Planet smallPlanet = new Planet(sun,"",au,t,e,"moon.png",false);
            smallPlanets.add(smallPlanet);
        }
    }
    @Override
    public void paint(Graphics g) {
        super.paintComponents(g);  // 背景图片
        g.drawImage(FrameUtil.getImage("bj.jpg"),0,0,Constant.FRAME_WIDTH,Constant.FRAME_HEIGHT,this);
        sun.draw(g);
        mercury.draw(g);
        venus.draw(g);
        earth.draw(g);
        mars.draw(g);
        jupiter.draw(g);
        saturn.draw(g);
        uranus.draw(g);
        neptune.draw(g);
        pluto.draw(g);
        huixing.draw3(g);
        for(int i = 0;i <smallPlanets.size();i++){
            Planet p = smallPlanets.get(i);
            p.draw2(g);

        }
    }

    public static void main(String[] args) {
        new SolarSystem().loadFrame("太阳系八大行星");
    }
}
