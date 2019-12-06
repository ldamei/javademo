package com.itdr.basic.demo1;

import java.util.Scanner;
public class Text4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //1)判断输入数字的是奇数还是偶数

        /*for(int m=1;m>=1||m<1;m++){
            System.out.println("请输入一个数字");
            m = sc.nextInt();
            if(m % 2 != 0){
                System.out.println("这是个奇数");
            }else{
                System.out.println("这是个偶数");
            }
        }
        System.out.println( );*/


        //2)判断输入的自然数是否为质数
        //质数是只能被1和自身整除的数
        int m = 1;
        while(m == 1){
            System.out.println("请输入一个数字");
            int a = sc.nextInt();
            if(a==1 ||a==2){
                System.out.println("这是个质数");
            }else{
                int num=0;
                for(int i = 1;i<=a;i++){
                    if(a % i == 0){
                        num++;
                    }
                }
                if(num == 2){
                    System.out.println("这是个质数");
                }else{
                    System.out.println("这不是个质数");
                }
            }
            System.out.println("--------------");
            System.out.println("还要继续吗？1继续/0取消");
            m = sc.nextInt();
        }

        //3)计算从1+2+3...+100，加到几时和为666


    }
}
