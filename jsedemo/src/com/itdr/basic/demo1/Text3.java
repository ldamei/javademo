package com.itdr.basic.demo1;

import java.util.Scanner;
public class Text3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        //选择语句练习
        //1)判断输入的数字是星期几
        /*if(m ==1){
            System.out.println("今天是星期一");
        }else if(m==2){
            System.out.println("今天是星期二");
        }else if(m==3){
            System.out.println("今天是星期三");
        }else if(m==4){
            System.out.println("今天是星期四");
        }else if(m==5){
            System.out.println("今天是星期五");
        }else if(m==6){
            System.out.println("今天是星期六");
        }else if(m==7){
            System.out.println("今天是星期日");
        }else{
            System.out.println("输入的数字有误");
        }*/

        //2)判断输入的月份是什么季节
        //春：3,4,5   夏：6,7,8   秋：9,10,11   冬：12,1,2
        /*if(m==3||m==4||m==5){
            System.out.println("现在是春天");
        }else if(m==6||m==7||m==8){
            System.out.println("现在是夏天");
        }else if(m==9||m==10||m==11){
            System.out.println("现在是秋天");
        }else if(m==12||m==1||m==2){
            System.out.println("现在是冬天");
        }else{
            System.out.println("输入的季节有误");
        }*/

        //3)判断输入的成绩等级
        //（	90=<A<=100	80=<B<90	  70=<C<80	60=<D<70 	  其它E）
        //分别用if语句和switch语句完成

        //if语句
        /*if(m>=90 && m<=100){
            System.out.println("你的成绩为A");
        }else if(m>=80 && m<90){
            System.out.println("你的成绩为B");
        }else if(m>=70 && m<80){
            System.out.println("你的成绩为C");
        }else if(m>=60 && m<70){
            System.out.println("你的成绩为D");
        }else if(m>=0 && m<60){
            System.out.println("你的成绩为E");
        }else{
            System.out.println("你的成绩无效");
        }*/

        //switch语句
        if(m<0 ||m>100){
            System.out.println("你的成绩无效");
            return;
        }
        switch(m / 10){
            case 10:
                System.out.println("你的成绩为A");
                break;
            case 9:
                System.out.println("你的成绩为A");
                break;
            case 8:
                System.out.println("你的成绩为B");
                break;
            case 7:
                System.out.println("你的成绩为C");
                break;
            case 6:
                System.out.println("你的成绩为D");
                break;
            default:
                System.out.println("你的成绩为E");
        }
    }
}
