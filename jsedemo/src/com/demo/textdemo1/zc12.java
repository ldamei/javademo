package com.demo.textdemo1;

public class zc12 {
    public static void main(String[] args){
        int score =94;
        String sex ="女";
        if(score>80&&sex=="女"){
            System.out.println("进入女子组决赛");
        }else if(score<=80&&sex=="男"){
            System.out.println("进入男子组决赛");
        }else System.out.println("不符合");
    }
}
