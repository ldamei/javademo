package com.demo.textdemo1;

public class zc16 {
    public static void main(String[] args){
        int sum=0; //保存1-50之间偶数的和
        int num=2;//代表1-50之间的偶数
        do{
            sum=sum+num;
            num=num+2;
        }while(num>=1&&num<=50);
        System.out.println("50以内的偶数之和为："+sum);

    }
}
