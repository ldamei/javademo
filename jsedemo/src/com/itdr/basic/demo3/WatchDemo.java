package com.itdr.basic.demo3;

import java.util.Scanner;
public class WatchDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //准备开店
        Watch w1 = new Watch();
        Watch w2 = new Watch();
        Watch w3 = new Watch();

        //定义商品的属性（初始化对象）
        w1.wname = "机械手表"; //对象名.属性
        w1.wprice = 1000;
        w2.wname = "运动手表";
        w2.wprice = 1500;
        w3.wname = "潜水手表";
        w3.wprice = 2000;

        //准备一个货架（现在只能用数组）
        Watch[] arr = new Watch[5];
        arr[0] = w1;
        arr[1] = w2;
        arr[2] = w3;

        System.out.println("======================");
        System.out.println("欢迎来到手表店");
        System.out.println("请选购以下手表:");

        //通过遍历数组，取出所有手表并展示出来
        int n = 1;
        while( n == 1){
            for(int i = 0;i<arr.length;i++){
                if(arr[i] != null){
                    System.out.println("商品序号:"+i+"商品名称:"+arr[i].wname+"商品价格:"+arr[i].wprice);
                }
            }
            //顾客选购商品
            System.out.println("请选择要购买的商品序号：");
            int m = sc.nextInt();
            //输出顾客选购的商品
            if(m<arr.length && m>=0){
                System.out.println("商品序号:"+m+"商品名称:"+arr[m].wname+"商品价格:"+arr[m].wprice);
            }else{
                System.out.println("你选择的商品"+m+"不存在");
            }
            System.out.println("你还要继续购买吗？1继续/0取消");
            n = sc.nextInt();
        }
    }
}
