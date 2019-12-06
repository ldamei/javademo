package com.itdr.basic.demo1;

import java.util.Scanner;
public class MathUtil1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
//        zs(m);

        /*int n = and(3,5);
        System.out.println(n);*/

        /*int i = min(3,5);
        System.out.println(i);*/

        /*int u = mul(3,5);
        System.out.println(u);*/

        /*double d = div(3,5);
        System.out.println(d);*/

        /*int o = mo(3,5);
        System.out.println(o);*/

        int a = getNum(m);
        if(a == 0){
            System.out.println("计算不出这样的和");
        }else{
            System.out.println("当计算到"+a+"的时候和为666");
        }
    }

    //判断是否为质数的方法
    public static void zs(int a){
        if(a==1 || a==2){
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
    }

    //计算两个数的加减乘除取模
    public static int and(int a,int b){
        int m = a + b;
        return m;
    }

    public static int min(int a,int b){
        int m = a - b;
        return m;
    }

    public static int mul(int a,int b){
        int m = a * b;
        return m;
    }

    public static double div(double a,double b){
        double m = a / b;
        return m;
    }

    public static int mo(int a,int b){
        int m = a % b;
        return m;
    }

    //计算从1+2+3...+100，加到几时和为666
    public static int getNum(int a){
        int s = 0;
        for(int i = 1;i<101;i++){
            s += i;
            if(s == a){
                return i;
            }
        }
        return 0;
    }
}
