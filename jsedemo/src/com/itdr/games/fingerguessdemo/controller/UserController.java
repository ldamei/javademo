package com.itdr.games.fingerguessdemo.controller;

import com.itdr.games.fingerguessdemo.service.UserService;

public class UserController {
    UserService us = new UserService();

    //用户注册，传用户名和密码
    public String register(String name,String psd){
        String s = us.register(name,psd);
        return s;
    }
}
