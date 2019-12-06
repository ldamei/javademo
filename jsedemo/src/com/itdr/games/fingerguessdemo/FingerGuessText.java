package com.itdr.games.fingerguessdemo;

import com.itdr.games.fingerguessdemo.controller.UserController;
import java.util.Scanner;
public class FingerGuessText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //用户注册
        System.out.println("请输入用户名：");
        String uname = sc.next();
        System.out.println("请输入密码：");
        String psd = sc.next();
        UserController uc = new UserController();
        String register = uc.register(uname,psd);
        System.out.println(register);

        //用户登录
    }

}
