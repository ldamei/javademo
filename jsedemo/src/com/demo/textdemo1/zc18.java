package com.demo.textdemo1;

public class zc18 {
    public static void main(String[] args){
        //保存累加值
        int sum =0;
        //从1循环到10
        for(int i = 1;i<=10;i++){
            //每次循环时累加求和
            sum = sum + i;
            //判断累加值是否大于20，如果满足条件则退出循环
            if(sum>20){
                System.out.println("当前的累加值为"+sum);
                //退出循环
            }
        }
    }
}
