package com.itdr.basic.textdemo1;
import java.util.Scanner;
public class Zc7 {
    public static void main(String[] args){
        int num =999;
        int count =0;
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();

        if(num>=0 && num<=999999999){
            for(;num!=0;num=num/10){
                count++;
            }
            System.out.println("它是个"+count+"位的数！");
        }
    }
}
