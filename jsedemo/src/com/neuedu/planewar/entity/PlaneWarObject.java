package com.neuedu.planewar.entity;

import java.awt.*;

/**
 * 项目中所有类的父类
 * @author ldamei
 * @date 2019/12/6 9:42
 */
public abstract class PlaneWarObject implements Moveable,Drawable{

    public int x;
    public int y;
    Image img;
    public int width;
    public int height;

    public int speed;

    @Override
    public void move() {

    }

    @Override
    public void draw(Graphics g) {

    }
}
