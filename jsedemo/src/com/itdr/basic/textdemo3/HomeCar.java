package com.itdr.basic.textdemo3;

public class HomeCar extends Car {
    private int num;

    //调用父类构造方法，完成继承属性赋值
    //homecar属性传值
    public HomeCar(int num,String userName,String color){
        super("","");
//        super("紫色","孙二娘");
        this.num = num;
        this.userName = userName;
        this.color = color;
    }

    //display方法
    public void display(){
        System.out.println(userName+"拥有的"+color+"颜色的私家车有"+num+"座位");
    }

    //重载display方法
    public void display(int num2){
        System.out.println("家用汽车大多有"+num2+"个座位");
    }
}
