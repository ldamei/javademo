package com.itdr.basic.demo1;

public class Text2 {
    public static void main(String[] args){

        //循环语句练习
        //1)请在控制台输出数据1-10
        for(int i = 1;i<11;i++){
            System.out.println(i);
        }

        //2)请在控制台输出数据10-1
        for(int i = 10;i>0;i--){
            System.out.println(i);
        }

        //3)计算1+2+3...+10的和
        int sum1 = 0;
        for(int i = 1;i<11;i++){
             sum1 += i;
        }
        System.out.println(sum1);

        //4)计算1~100之间奇数的和
        int sum2 = 0;
        for(int i = 1;i<101;i++){
            if(i % 2 != 0){
                sum2 += i;
            }
        }
        System.out.println(sum2);

        //5)求5的阶乘
        int mul = 1;
        for(int i = 1;i<6;i++){
            mul = mul*i;
        }
        System.out.println(mul);
    }
}
