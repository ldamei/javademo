package com.itdr.games.auctiondemo.service;

import com.itdr.games.auctiondemo.dao.UserDao;
import com.itdr.games.auctiondemo.pojo.Users;

public class UserService {
    private UserDao ud = new UserDao();

    //用户注册
    public String register(String name, String psd){
        //参数非空判断
        //查看当前注册用户是否已经注册
        Users users = ud.selectByUname(name);
        if(users != null){
            return "用户名已存在！";
        }
        //注册用户，把用户信息存储起来
        Users u = new Users();
        u.setUname(name);
        u.setPassword(psd);
        u.setMoney(0);
        int i = ud.addOne(u);
        if(i<= 0){
            return "用户注册失败！";
        }
        //用户注册成功
        return "用户注册成功！";
    }

    //用户登录
    public int login(String uname,String psd){
        //查看当前登录用户是否已经注册
        int users = ud.selectByUnamePsd(uname,psd);
        if(users == -1){
            return -1;
        }
        return users;
    }

    //账户充值
    public int sum(int num,String uname){
        int m = ud.pay(num,uname);
        if(m != 0){
            return m;
        }
        return 0;
    }

    //购物车
    public String selectCart(int y,int f,String uname2){
        String sc = ud.selectCart(y,f,uname2);
        return sc;
    }
    public String selectCart2(int y,String f2,String uname2){
        String sc = ud.selectCart2(y,f2,uname2);
        return sc;
    }

    //查看购物车
    public String gwc(){
        String sc = ud.gwc();
        return sc;
    }

    //结算
    public String pay2(int j){
        String sc = ud.pay2(j);
        return sc;
    }

    //百宝囊
    public String bbn(){
        String sc = ud.bbn();
        return sc;
    }

    //上架
    public String box(String uname,String sj){
        String sc = ud.box(uname,sj);
        return sc;
    }
}
