package com.itdr.basic.textdemo3;

import org.omg.CORBA.Object;

public class Car {
    public String color;
    public String userName;

    //给属性传值
    public Car(String color,String userName){
        this.color = color;
        this.userName=userName;
    }

    //use方法
    public void use(){
        System.out.println("我是机动车！");
    }

    //equal方法
    @Override
    public boolean equals(java.lang.Object obj) {
        Car car = (Car) obj;
        return this.color.equals(car.color) && this.userName.equals(car.userName);
    }
}
