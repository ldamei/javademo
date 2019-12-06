package com.itdr.games.auctiondemo.controller;

import com.itdr.games.auctiondemo.service.UserService;

public class UserController {
    UserService us = new UserService();

    //用户注册，用户名和密码，注册成功返回用户信息
    public String register(String uname, String psd){
        String s = us.register(uname,psd);
        return s;
    }

    //用户登录，登录成功返回用户信息
    public int  login(String uname, String psd){
        int s = us.login(uname,psd);
        return s;
    }

    //账户充值
    public int sum(int num,String uname){
        int s = us.sum(num,uname);
        return s;
    }

    //购物车
    public String selectCart(int y,int f,String uname2){
        String s = us.selectCart(y,f,uname2);
        return s;
    }
    public String selectCart2(int y,String f2,String uname2){
        String s = us.selectCart2(y,f2,uname2);
        return s;
    }

    //查看购物车
    public String gwc(){
        String s = us.gwc();
        return s;
    }

    //结算
    public String pay2(int j){
        String s = us.pay2(j);
        return s;
    }

    //百宝囊
    public String bbn(){
        String s = us.bbn();
        return s;
    }

    //上架
    public String box(String uname,String sj){
        String s = us.box(uname,sj);
        return s;
    }
}
