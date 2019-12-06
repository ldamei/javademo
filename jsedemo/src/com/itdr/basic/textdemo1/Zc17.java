package com.itdr.basic.textdemo1;

public class Zc17 {
    public static void main(String[] args){
        int sum = 0; //保存不能被3整除的数之和
        //循环变量i初始值为1，每执行一次对变量加1 ，只要小于等于100就重复执行循环
        for(int i = 1;i<=100;i++){
            //变量i与3进行求模（取余），如果不等于0，则表示不能被3整除
            if(i % 3 !=0){
                sum=sum+1;//累加求和
            }
        }
        System.out.println("1到100之间不能被3整除的数之和为"+sum);
    }
}
