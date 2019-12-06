package com.itdr.basic.textdemo3;

public class Taxi extends Car {
    private String company;

    //调用父类构造方法，完成继承属性赋值
    //taxi属性传值
    public Taxi(String company){
        super("蓝色","张小泉");
        this.company = company;
    }

    //不能被重写的ride方法
    public final void ride(){
        System.out.println(userName+"的出租车是所属于在"+company+"公司的");
    }

    //重写父类的use方法
    @Override
    public void use() {
        System.out.println("出租车是提高市民生活质量的重要条件之一");
    }

    //重写toString方法
    @Override
    public String toString() {
        return "taxi的信息是："+userName+"拥有一辆"+color+"的出租车";
    }
}
