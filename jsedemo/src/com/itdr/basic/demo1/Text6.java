package com.itdr.basic.demo1;

public class Text6 {
    public static void main(String[] args) {
        for(int a = 1;a <= 4;a++){           //定义输出三角形的行数
            for(int b = a;b <= 5;b++){        //定义输出三角形的列数
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
