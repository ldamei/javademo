package com.itdr.games.fingerguessdemo.service;

import com.itdr.games.fingerguessdemo.dao.UserDao;
import com.itdr.games.fingerguessdemo.pojo.Users;

public class UserService {
    private UserDao ud = new UserDao();

    //用户注册
    public String register(String name,String psd){
        //参数非空判断
        //查看当前用户是否已注册
        Users users = ud.selectByName(name);
        if(users != null){
            return "用户名已存在";
        }
        //把用户信息存储起来
        Users u = new Users();
        u.setUname(name);
        u.setPssword(psd);
        int i = ud.addOne(u);
        if(i <= 0){
            return "用户注册失败";
        }
        return "用户注册成功";
    }
}
