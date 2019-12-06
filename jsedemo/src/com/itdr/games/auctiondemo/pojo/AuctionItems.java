package com.itdr.games.auctiondemo.pojo;

public class AuctionItems {
    public int number;//花的序号
    public String fname;//花的名称
    public int price;//花的价格
    public String color;//花的颜色
    public String flanguage;//花语
    public String fintroduction;//花的介绍

    public AuctionItems(int number,String fname,int price,String color,String flanguage,String fintroduction){
        this.number = number;
        this.fname = fname;
        this.price = price;
        this.color = color;
        this.flanguage = flanguage;
        this.fintroduction = fintroduction;
    }

    public int getNumber() {
        return number;
    }

    public String getFname() {
        return fname;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getFlanguage() {
        return flanguage;
    }

    public String getFintroduction() {
        return fintroduction;
    }
}
