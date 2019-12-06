package com.itdr.games.auctiondemo.dao;

import com.itdr.games.auctiondemo.pojo.Users;

import static com.itdr.games.auctiondemo.dao.AuctionItemDao.ai;

public class UserDao {
    //用户数据数组
    private static Users[] users;
    private static String[] cart;
    private static String[] box;
    private static int[] money;
    private static int[] wmoney;

    static {
        users = new Users[10];
        cart = new String[5];
        box = new String[5];
        money = new int[1];
        wmoney = new int[1];
    }

    //用户注册
    //根据用户名查找一个用户
    public Users selectByUname(String uname) {
        //遍历用户数组，查看非空空间内的对象和传进来的用户名是否同名
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (users[i].getUname().equals(uname)) {
                    return users[i];
                }
            }
        }
        return null;
    }

    //往数据数组内放入一个新用户
    public int addOne(Users u) {
        //遍历用户数组，找到空的位置，存放新的用户数据
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = u;
                return 1;
            }
        }
        return 0;
    }

    //用户登录
    //根据用户名和密码查找一个用户
    public int selectByUnamePsd(String uname, String psd) {
        //遍历用户数组，查看非空空间内的对象和传进来的用户名密码是否相同
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (users[i].getUname().equals(uname) && users[i].getPassword().equals(psd)) {
                    int m = users[i].getMoney();
                    return m;
                }
            }
        }
        return -1;
    }

    //用户充值
    public int pay(int num, String uname) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (users[i].getUname().equals(uname)) {
                    if (num > -1 && num < 101) {
                        money[0] = money[0] + num;
                        return money[0];
                    } else {
                        System.out.println("你充值的金额已超上限，请理智充值！");
                    }
                }
            }
        }
        return 0;
    }

    //购物车
    public String selectCart(int y, int f, String uname2) {
        if (y == 1) {
            for (int i = 0; i < users.length; i++)
                //如果名字和数组中的名字相同，并且输入的序号和数组中的序号也相同，则执行以下操作：
                if (users[i].getUname().equals(uname2) && ai[i].getNumber() == f) {
                    for (int j = 0; j < cart.length; j++) {
                        if (cart[j] == null) {
                            wmoney[0] = wmoney[0] + ai[i].getPrice();
                            cart[j] = ai[i].getFname() + ai[i].getPrice();
                            return "你本次要购买的物品名称是：" + cart[j];
                        }
                    }
                }
            return "";
        }
        return "";
    }

    public String selectCart2(int y, String f2, String uname2) {
        if (y == 1) {
            for (int i = 0; i < users.length; i++)
                //如果名字和数组中的名字相同，并且输入的序号和数组中的序号也相同，则执行以下操作：
                if (users[i].getUname().equals(uname2) && ai[i].getFname().equals(f2)) {
                    for (int j = 0; j < cart.length; j++) {
                        if (cart[j] == null) {
                            wmoney[0] = wmoney[0] + ai[i].getPrice();
                            cart[j] = ai[i].getFname() + ai[i].getPrice();
                            return "你本次要购买的物品名称是：" + cart[j];
                        }
                    }
                }
            return "";
        }
        return "";
    }

    //查看购物车
    public String gwc() {
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                System.out.println("当前位置商品为：" + null);
            } else {
                System.out.println("当前位置商品为：" + cart[i]);
            }
        }
        return "";
    }

    //结算
    public String pay2(int j) {
        if (j == 1) {
            if (money[0] > wmoney[0]) {
                for (int i = 0; i < box.length; i++) {
                    if (cart[i] != null) {
                        box[i] = cart[i];
                        cart[i] = null;
                    }
                }
                money[0] = money[0] - wmoney[0];
                System.out.println("购买成功！");
                return "当前用户资金剩："+money[0];
            }else{
                return "你的资金不足，请先充值用户！";
            }
        }
        return "";
    }

    //百宝囊
    public String bbn() {
        for (int i = 0; i < box.length; i++) {
            if (cart[i] == null) {
                System.out.println("我的宝贝：" + box[i]);
            } else {
                box[i] = cart[i];
                System.out.println("我的宝贝：" + box[i]);
            }
        }
        return "";
    }

    //上架
    public String box(String uname, String sj) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUname().equals(uname) && ai[i].getFname().equals(sj)) {
                if (money[0] > 501) {
                    System.out.println("我的宝贝：" + box[i]);
                }
            }
        }
        return "";
    }
}


