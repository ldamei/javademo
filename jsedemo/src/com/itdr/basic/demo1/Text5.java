package com.itdr.basic.demo1;
import java.util.Scanner;
public class Text5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：（例如输入6，表示打印66乘法表）");
        int m = sc.nextInt();
        chengFa(m);
    }

    //输出nn乘法表
    public static void chengFa(int n){
        for(int x = 1;x<=n;x++){
            for(int y = 1;y<=x;y++){
                System.out.println(y+ "*" +x +"=" +x*y+ "\t");
            }
            System.out.println( );
        }
    }
}
