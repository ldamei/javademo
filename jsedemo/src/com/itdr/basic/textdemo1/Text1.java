package com.itdr.basic.textdemo1;

public class Text1 {
    public static void main(String[] args){
//        计算1~100之间奇数的和
        int s = 0;
        for(int i = 1;i<101;i++){
//            每次循环，判断I的值是奇数还是偶数
            if(i % 2 != 0){
//                把每一个奇数加起来
                s +=i;
            }
        }
        System.out.println(s);
    }
}
