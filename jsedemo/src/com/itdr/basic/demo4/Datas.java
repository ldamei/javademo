package com.itdr.basic.demo4;

public class Datas {
    String category;//数据类型
    String yz;//原始值
    String xz;//新的值

    //无参构造方法
    public Datas(){

    }

    //有参构造方法
    public Datas(String c,String y,String x){
        this.category = c;
        this.yz = y;
        this.xz = x;
    }

/*    public static void main(String[] args){
        Datas d = new Datas("生肖","月份","星座");
    }*/
}
