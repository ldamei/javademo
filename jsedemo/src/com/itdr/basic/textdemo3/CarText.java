package com.itdr.basic.textdemo3;

public class CarText {

    public static void main(String[] args) {
        //实例化两个父类对象
        Car car1 = new Car("红色","张三");
        Car car2 = new Car("红色","张三");

        car1.use();
        System.out.println("car1和car2的引用比较："+car1.equals(car2));
        System.out.println("=========================================");

        //taxi属性赋值
        Taxi t = new Taxi("长生");

        t.ride();
        t.use();
        System.out.println(t.toString());
        System.out.println("=========================================");

        //homecar属性赋值
        HomeCar h = new HomeCar(7,"孙二娘","紫色");

        h.display();
        h.display(5);
    }
}
