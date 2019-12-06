package com.itdr.games.auctiondemo;

import com.itdr.games.auctiondemo.controller.AuctionItemController;
import com.itdr.games.auctiondemo.controller.UserController;
import com.itdr.games.auctiondemo.pojo.Users;

import java.util.Scanner;

public class AuctionText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserController uc = new UserController();
        AuctionItemController aic = new AuctionItemController();

        //注册模块--for循环注册登录
        on:
        for (int i = 0; i >= 0; i++) {
            System.out.println("欢迎来到星空拍卖行！");
            System.out.println("1.注册用户");
            System.out.println("2.登录用户");
            int h = sc.nextInt();
            switch (h) {
                case 1:
                    //（1）用户注册
                    System.out.println("请开始注册用户");
                    System.out.println("请输入用户名：");
                    String uname = sc.next();
                    System.out.println("请输入密码：");
                    String psd = sc.next();

                    String register = uc.register(uname, psd);
                    if (register.equals("用户名已存在！")) {
                        System.out.println(register);
                        System.out.println("========================");
                        continue on;
                    }
                    System.out.println(register);
                    System.out.println("========================");
                    break;

                case 2:
                    //（2）用户登录
                    System.out.println("请开始登录用户");
                    System.out.println("请输入用户名：");
                    String uname2 = sc.next();
                    System.out.println("请输入密码：");
                    String psd2 = sc.next();

                    int login = uc.login(uname2, psd2);
                    if (login >= 0) {
                        System.out.println("用户登录成功!");
                        System.out.println("---当前用户：" + Users.getUname() + "---");
                        System.out.println("---当前用户资金：" + login + "---");
                        System.out.println("---当前用户身份：平民---");
                        System.out.println("========================");

                        out:
                        for (int z = 0; z >= 0; z++) {
                            System.out.println("请输入1/2/3/4/5，查看以下账户功能：");
                            System.out.println("1.账户充值");
                            System.out.println("2.拍卖品");
                            System.out.println("3.购物车");
                            System.out.println("4.百宝囊");
                            System.out.println("5.上架");
                            System.out.println("6.重新登录");
                            System.out.println("------");

                            int q = sc.nextInt();
                            switch (q) {
                                case 1:
                                    //（3）账户充值
                                    System.out.println("你要充值账户吗？1充值/0取消");
                                    int c = sc.nextInt();
                                    if (c == 1) {
                                        for (int j = 0; j >= 0; j++) {
                                            System.out.println("请输入1-100之间的数字金额进行充值");
                                            int num = sc.nextInt();
                                            int sum = uc.sum(num, uname2);
                                            System.out.println("---当前用户：" + Users.getUname() + "---");
                                            System.out.println("---当前用户资金：" + sum + "---");
                                            //通过用户资金，判断用户身份
                                            if (sum >= 0 && sum < 100) {
                                                System.out.println("---当前用户身份：平民---");
                                            } else if (sum >= 100 && sum < 500) {
                                                System.out.println("---当前用户身份：地主---");
                                            } else {
                                                System.out.println("---当前用户身份：土豪---");
                                            }
                                            System.out.println("========================");
                                            System.out.println("你还要继续充值吗？1继续/0取消");
                                            int n = sc.nextInt();
                                            if (n == 1) {
                                                continue;
                                            } else {
                                                break;   //如果用户选择不继续充值则跳出大for循环
                                            }
                                        }
                                    } else {
                                        break out;
                                    }
                                    break;
                                case 2:
                                    //拍卖品模块--（1）展示所有物品
                                    System.out.println("========================");
                                    System.out.println("以下为本次拍卖的花种：");
                                    String ss = aic.show();
                                    System.out.println(ss);

                                    //用户选择查看详情的方式
                                    System.out.println("---------");
                                    System.out.println("请输入1/2/3/4，查看相关的功能：");
                                    System.out.println("1.花价排行");
                                    System.out.println("2.花的序号");
                                    System.out.println("3.搜索花名");
                                    System.out.println("4.退出");
                                    System.out.println("========================");
                                    int a = sc.nextInt();
                                    switch (a) {
                                        case 1:
                                            System.out.println("拍卖品-花的价格从高到低为：");
                                            String ssf = aic.paixu();
                                            System.out.println(ssf);
                                            System.out.println("========================");
                                            break;
                                        case 2:
                                            //（2）展示用户按序号选择的物品详情
                                            for (int y2 = 0; y2 > -1; y2++) {
                                                String ss1 = aic.selectByNumber();
                                                System.out.println(ss1);
                                                System.out.println("请选择你想查看的花的序号：");
                                                int f = sc.nextInt();
                                                String ss2 = aic.selectByShow(f);
                                                System.out.println(ss2);
                                                System.out.println("------");
                                                //把物品加入购物车
                                                System.out.println("你要把该物品加入购物车吗？1继续/0取消");
                                                int y = sc.nextInt();
                                                if (y == 1) {
                                                    String sy = uc.selectCart(y, f, uname2);
                                                    System.out.println(sy);
                                                    System.out.println("------");
                                                } else {
                                                    break;
                                                }
                                                System.out.println("你还要继续加入购物车吗？1继续/0取消");
                                                int y1 = sc.nextInt();
                                                if (y1 == 1) {
                                                    continue;
                                                } else if (y1 == 0) {
                                                    break;
                                                } else {
                                                    System.out.println("你的方式有误，请重新输入！");
                                                }
                                            }
                                            break;
                                        case 3:
                                            //（3）展示用户按名称选择的物品详情
                                            for (int y2 = 0; y2 > -1; y2++) {
                                                System.out.println("请输入你想查看的花名：");
                                                String f2 = sc.next();
                                                String ss4 = aic.selectByShow2(f2);
                                                System.out.println(ss4);
                                                System.out.println("------");
                                                //把物品加入购物车
                                                System.out.println("你要把该物品加入购物车吗？1继续/0取消");
                                                int y = sc.nextInt();
                                                if (y == 1) {
                                                    String sy = uc.selectCart2(y, f2, uname2);
                                                    System.out.println(sy);
                                                    System.out.println("------");
                                                } else {
                                                    break;
                                                }
                                                System.out.println("你还要继续加入购物车吗？1继续/0取消");
                                                int y1 = sc.nextInt();
                                                if (y1 == 1) {
                                                    continue;
                                                } else if (y1 == 0) {
                                                    break;
                                                } else {
                                                    System.out.println("你的方式有误，请重新输入！");
                                                    break;
                                                }
                                            }
                                            break;
                                        case 4:
                                            break out;
                                    }
                                case 3:
                                    //查看购物车
                                    String s = uc.gwc();
                                    System.out.println(s);
                                    System.out.println("你要结算购物车中的物品吗？1继续/0取消");
                                    int j = sc.nextInt();
                                    String s2 = uc.pay2(j);
                                    System.out.println(s2);
                                    System.out.println("========================");
                                    break;
                                case 4:
                                    //百宝囊
                                    String s3 = uc.bbn();
                                    System.out.println(s3);
                                    break;
                                case 5:
                                    //上架
                                    System.out.println("请输入你要上架的物品：");
                                    String sj = sc.next();
                                    String s4 = uc.box(uname2, sj);
                                    System.out.println(s4);
                                    break;
                                case 6:
                                    continue on;
                            }
                        }
                        break;
                    } else {
                        System.out.println("用户登录失败，请重新登录！");
                        System.out.println("========================");
                        continue on;
                    }
            }
        }
    }
}





