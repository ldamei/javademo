package com.itdr.basic2.demo2;

import com.itdr.basic2.demo2.pojo.*;

import java.util.Scanner;

public class RuneText {
    public static void main(String[] args) {
        //初始化
        //存放用户数据
        Users[] uarr = new Users[100];
        //存放三种颜色的符文数组
        OrangeRune[] oarr = new OrangeRune[31];
        GreenRune[] garr = new GreenRune[31];
        BlueRune[] barr = new BlueRune[31];
        //存放用户选好的符文数组
        String[] sarr = new String[9];

        for (int l = 1; l > 0; l++) {
            Scanner sc = new Scanner(System.in);
            //循环注册、登录
            for (int r = 1; r > 0; r++) {
                //用户注册
                System.out.println("欢迎来到符文大陆！");
                System.out.println("请输入用户名和密码注册账号");
                String uname = sc.next();
                int upsd = sc.nextInt();
                Users u = new Users();
                u.setUserName(uname);
                String name = u.getUserName();
                u.setUserPsd(upsd);
                int psd = u.getUserPsd();

                int m = register(name,psd, u, uarr);
                if (m == 1) {
                    System.out.println("注册成功");
                    System.out.println("=========================================");
                }
                if (m == 2) {
                    System.out.println("您已经注册过账号，不需要再次注册");
                    System.out.println("=========================================");
                }

                //用户登录
                System.out.println("请输入用户名和密码登录符文大陆");
                String uname2 = sc.next();
                int psd2 = sc.nextInt();

                int n = login(uname2, psd2, uarr);
                if (n == 1) {
                    System.out.println("登录成功");
                    System.out.println("您的符文组合为：" + sarr[0] + "、" + sarr[1] + "、" + sarr[2] + "、" + sarr[3] + "、" + sarr[4] + "、" + sarr[5] + "、" + sarr[6] + "、" + sarr[7] + "、" + sarr[8]);
                    System.out.println("=========================================");
                    break;
                } else {
                    System.out.println("请先注册账号");
                    System.out.println("=========================================");
                }
            }
           //
            System.out.println("输入1开始选择符文吧");
            int s = sc.nextInt();
            if (s == 1) {
                //用户输入的确认值为0时，循环此过程重新选择符文
                int t = 0;
                while (t == 0) {
                    //创建三种颜色的对象
                    // 橙色对象
                    OrangeRune o1 = new OrangeRune("勇气", "橙色", "攻击", "1级", "+0.60", "", "", "", "");
                    oarr[0] = o1;
                    OrangeRune o2 = new OrangeRune("白刃", "橙色", "攻速", "2级", "+0.70", "+0.20%", "", "", "");
                    oarr[1] = o2;
                    OrangeRune o3 = new OrangeRune("振奋", "橙色", "暴击", "3级", "", "+0.50%", "+0.30%", "", "");
                    oarr[2] = o3;
                    OrangeRune o4 = new OrangeRune("暴戾", "橙色", "生命", "4级", "+1.50", "", "", "+13.50", "");
                    oarr[3] = o4;
                    OrangeRune o5 = new OrangeRune("异变", "橙色", "穿透", "5级", "+2.00", "", "", "", "+3.60");
                    oarr[4] = o5;
                    System.out.println("以下为橙色符文：");
                    System.out.println("\t");
                    System.out.println("1." + "名字:" + oarr[0].ename + "，" + "颜色:" + oarr[0].color + "，" + "类型:" + oarr[0].category + "，" + "等级:" + oarr[0].level + "，" + "物理攻击:" + oarr[0].getAdHurt());
                    System.out.println("2." + "名字:" + oarr[1].ename + "，" + "颜色:" + oarr[1].color + "，" + "类型:" + oarr[1].category + "，" + "等级:" + oarr[1].level + "，" + "物理攻击:" + oarr[1].getAdHurt() + "，" + "攻击速度:" + oarr[1].getAdSpeed());
                    System.out.println("3." + "名字:" + oarr[2].ename + "，" + "颜色:" + oarr[2].color + "，" + "类型:" + oarr[2].category + "，" + "等级:" + oarr[2].level + "，" + "攻击速度:" + oarr[2].getAdSpeed() + "，" + "暴击率:" + oarr[2].getCrit());
                    System.out.println("4." + "名字:" + oarr[3].ename + "，" + "颜色:" + oarr[3].color + "，" + "类型:" + oarr[3].category + "，" + "等级:" + oarr[3].level + "，" + "物理攻击:" + oarr[3].getAdHurt() + "，" + "最大生命:" + oarr[3].getMaxlife());
                    System.out.println("5." + "名字:" + oarr[4].ename + "，" + "颜色:" + oarr[4].color + "，" + "类型:" + oarr[4].category + "，" + "等级:" + oarr[4].level + "，" + "物理攻击:" + oarr[4].getAdHurt() + "，" + "物理穿透:" + oarr[4].getAdpass());
                    System.out.println("\t");
                    System.out.println("请选择三个橙色符文名字：");
                    String q = sc.next();
                    String q2 = sc.next();
                    String q3 = sc.next();

                    //绿色对象
                    GreenRune g1 = new GreenRune("应激", "绿色", "功能", "1级", "+0.20%", "", "", "", "", "");
                    garr[0] = g1;
                    GreenRune g2 = new GreenRune("坚壁", "绿色", "防御", "2级", "", "+2.50", "", "", "", "");
                    garr[1] = g2;
                    GreenRune g3 = new GreenRune("风怒", "绿色", "攻击", "3级", "", "", "+0.40", "+2.90", "", "");
                    garr[2] = g3;
                    GreenRune g4 = new GreenRune("奇袭", "绿色", "攻速", "4级", "+0.50%", "", "", "", "+0.40%", "");
                    garr[3] = g4;
                    GreenRune g5 = new GreenRune("敬畏", "绿色", "吸血", "5级", "", "+5.90", "", "", "", "+0.70%");
                    garr[4] = g5;
                    System.out.println("以下为绿色符文：");
                    System.out.println("\t");
                    System.out.println("1." + "名字:" + garr[0].ename + "，" + "颜色:" + garr[0].color + "，" + "类型:" + garr[0].category + "，" + "等级:" + garr[0].level + "，" + "冷却缩减:" + garr[0].getCool());
                    System.out.println("2." + "名字:" + garr[1].ename + "，" + "颜色:" + garr[1].color + "，" + "类型:" + garr[1].category + "，" + "等级:" + garr[1].level + "，" + "物理防御:" + garr[1].getAddefense());
                    System.out.println("3." + "名字:" + garr[2].ename + "，" + "颜色:" + garr[2].color + "，" + "类型:" + garr[2].category + "，" + "等级:" + garr[2].level + "，" + "物理攻击:" + garr[2].getAdSpeed() + "，" + "法术防御:" + garr[2].getApdefense());
                    System.out.println("4." + "名字:" + garr[3].ename + "，" + "颜色:" + garr[3].color + "，" + "类型:" + garr[3].category + "，" + "等级:" + garr[3].level + "，" + "冷却缩减:" + garr[3].getCool() + "，" + "攻击速度:" + garr[3].getAdSpeed());
                    System.out.println("5." + "名字:" + garr[4].ename + "，" + "颜色:" + garr[4].color + "，" + "类型:" + garr[4].category + "，" + "等级:" + garr[4].level + "，" + "物理防御:" + garr[4].getAddefense() + "，" + "法术吸血:" + garr[4].getApblood());
                    System.out.println("\t");
                    System.out.println("请选择三个绿色符文名字：");
                    String w = sc.next();
                    String w2 = sc.next();
                    String w3 = sc.next();

                    //蓝色对象
                    BlueRune b1 = new BlueRune("活力", "蓝色", "生命", "1级", "+15.00", "", "", "", "", "");
                    barr[0] = b1;
                    BlueRune b2 = new BlueRune("刚毅", "蓝色", "攻击", "2级", "", "+0.30", "+0.40%", "", "", "");
                    barr[1] = b2;
                    BlueRune b3 = new BlueRune("绽放", "蓝色", "功能", "3级", "+12.00", "", "", "+4.20", "", "");
                    barr[2] = b3;
                    BlueRune b4 = new BlueRune("吞噬", "蓝色", "吸血", "4级", "", "", "+0.80%", "", "+0.40%", "");
                    barr[3] = b4;
                    BlueRune b5 = new BlueRune("兽痕", "蓝色", "暴击", "5级", "+60.00", "", "", "", "", "+0.50%");
                    barr[4] = b5;
                    System.out.println("以下为蓝色符文：");
                    System.out.println("\t");
                    System.out.println("1." + "名字:" + barr[0].ename + "，" + "颜色:" + barr[0].color + "，" + "类型:" + barr[0].category + "，" + "等级:" + barr[0].level + "，" + "最大生命:" + barr[0].getMaxlife());
                    System.out.println("2." + "名字:" + barr[1].ename + "，" + "颜色:" + barr[1].color + "，" + "类型:" + barr[1].category + "，" + "等级:" + barr[1].level + "，" + "物理攻击:" + barr[1].getAdHurt() + "，" + "物理吸血:" + barr[1].getAdblood());
                    System.out.println("3." + "名字:" + barr[2].ename + "，" + "颜色:" + barr[2].color + "，" + "类型:" + barr[2].category + "，" + "等级:" + barr[2].level + "，" + "最大生命:" + barr[2].getMaxlife() + "，" + "每5秒回血:" + barr[2].getFive());
                    System.out.println("4." + "名字:" + barr[3].ename + "，" + "颜色:" + barr[3].color + "，" + "类型:" + barr[3].category + "，" + "等级:" + barr[3].level + "，" + "物理吸血:" + barr[3].getAdblood() + "，" + "移速:" + barr[3].getMovespeed());
                    System.out.println("5." + "名字:" + barr[4].ename + "，" + "颜色:" + barr[4].color + "，" + "类型:" + barr[4].category + "，" + "等级:" + barr[4].level + "，" + "最大生命:" + barr[4].getMaxlife() + "，" + "暴击率:" + barr[4].getCrit());
                    System.out.println("\t");
                    System.out.println("请选择三个蓝色符文名字：");
                    String e = sc.next();
                    String e2 = sc.next();
                    String e3 = sc.next();

                    int o = ofuwen(q, q2, q3, oarr);
                    //判断用户选择的橙色符文
                    if (o == 1) {
                        System.out.println("您选择的橙色符文是：" + q + "、" + q2 + "、" + q3);
                    } else {
                        System.out.println("您的选择无效，请输入0重新选择");
                    }
                    int g = gfuwen(w, w2, w3, garr);
                    //判断用户选择的绿色符文
                    if (g == 1) {
                        System.out.println("您选择的绿色符文是：" + w + "、" + w2 + "、" + w3);
                    } else {
                        System.out.println("您的选择无效，请输入0重新选择");
                    }
                    int b = bfuwen(e, e2, e3, barr);
                    //判断用户选择的蓝色符文
                    //判断用户是否确认选择
                    if (b == 1) {
                        System.out.println("您选择的蓝色符文是：" + e + "、" + e2 + "、" + e3);
                        System.out.println("您确认您的选择吗？1确认选择/0重新选择");
                    } else {
                        System.out.println("您的选择无效，请输入0重新选择");
                    }
                    //用户输入是否确认选择的值
                    t = sc.nextInt();
                    if (t == 1) {
                        int p = sfuwenw(q, q2, q3, w, w2, w3, e, e2, e3, sarr);
                        if (p == 1) {
                            System.out.println("您的符文组合为：" + sarr[0] + "、" + sarr[1] + "、" + sarr[2] + "、" + sarr[3] + "、" + sarr[4] + "、" + sarr[5] + "、" + sarr[6] + "、" + sarr[7] + "、" + sarr[8]);                        }
                        break;
                    } else {
                        continue;
                    }
                }
                System.out.println("勇士，下面去开启你新的征程吧！");
            }
        }
    }

    //注册方法
    public static int register(String name, int psd, Users u, Users[] uarr) {
        for (int i = 0; i < uarr.length; i++) {
            if (uarr[i] == null) {
                uarr[i] = u;
                return 1;
            }
            //判断用户输入的名字是否与数组中的值相等
            if (uarr[i].getUserName().equals(name) && uarr[i].getUserPsd() == (psd)) {
                return 2;
            }
        }
        return -1;
    }

    //登录方法
    public static int login(String name2, int psd2, Users[] uarr) {
        for (int i = 0; i < uarr.length; i++) {
            if (uarr[i] != null) {
                //判断用户录入的值是否与存放用户信息数组中的值相等
                if (uarr[i].getUserName().equals(name2) && uarr[i].getUserPsd() == (psd2)) {
                    return 1;
                }
            }
        }
        return -1;
    }

    //取橙色符文方法
    public static int ofuwen(String q, String q2, String q3, OrangeRune[] oarr) {
        for (int i = 0; i < oarr.length; i++) {
            //循环判断用户录入的第一个值是否与橙色符文数组中的值相等
            if (oarr[i] != null) {
                if (oarr[i].ename.equals(q)) {
                    for (int j = 0; j < oarr.length; j++) {
                        //循环判断用户录入的第二个值是否与橙色符文数组中的值相等
                        if (oarr[j].ename.equals(q2)) {
                            for (int k = 0; k < oarr.length; k++) {
                                //循环判断用户录入的第三个值是否与橙色符文数组中的值相等
                                if (oarr[k].ename.equals(q3)) {
                                    return 1;
                                }
                            }
                            continue;
                        }
                    }
                    continue;
                }
            }
        }
        return -1;
    }

    //取绿色符文方法
    public static int gfuwen(String w, String w2, String w3, GreenRune[] garr) {
        for (int i = 0; i < garr.length; i++) {
            //循环判断用户录入的第一个值是否与绿色符文数组中的值相等
            if (garr[i] != null) {
                if (garr[i].ename.equals(w)) {
                    for (int j = 0; j < garr.length; j++) {
                        //循环判断用户录入的第二个值是否与绿色符文数组中的值相等
                        if (garr[j].ename.equals(w2)) {
                            for (int k = 0; k < garr.length; k++) {
                                //循环判断用户录入的第三个值是否与绿色符文数组中的值相等
                                if (garr[k].ename.equals(w3)) {
                                    return 1;
                                }
                            }
                            continue;
                        }
                    }
                    continue;
                }
            }
        }
        return -1;
    }

    //取蓝色符文方法
    public static int bfuwen(String e, String e2, String e3, BlueRune[] barr) {
        for (int i = 0; i < barr.length; i++) {
            //循环判断用户录入的第一个值是否与蓝色符文数组中的值相等
            if (barr[i] != null) {
                if (barr[i].ename.equals(e)) {
                    for (int j = 0; j < barr.length; j++) {
                        //循环判断用户录入的第二个值是否与蓝色符文数组中的值相等
                        if (barr[j].ename.equals(e2)) {
                            for (int k = 0; k < barr.length; k++) {
                                //循环判断用户录入的第三个值是否与蓝色符文数组中的值相等
                                if (barr[k].ename.equals(e3)) {
                                    return 1;
                                }
                            }
                            continue;
                        }
                    }
                    continue;
                }
            }
        }
        return -1;
    }

    //存放选择好的符文
    public static int sfuwenw(String q, String q2, String q3, String w, String w2, String w3, String e, String e2, String e3, String[] carr) {
        for (int h = 0; h < carr.length; h++) {
            if (carr[h] == null) {
                carr[0] = q;
                carr[1] = q2;
                carr[2] = q3;
                carr[3] = w;
                carr[4] = w2;
                carr[5] = w3;
                carr[6] = e;
                carr[7] = e2;
                carr[8] = e3;
                return 1;
            }
        }
        return -1;
    }
}


