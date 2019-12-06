package com.itdr.games.auctiondemo.dao;

import com.itdr.games.auctiondemo.pojo.AuctionItems;

public class AuctionItemDao {
    static AuctionItems[] ai = new AuctionItems[5];

    //（1）展示所有物品
    public String show() {
        //给属性赋值，并放入数组中
        AuctionItems a = new AuctionItems(1, "薰衣草", 50, "紫色", "Waiting For Love！", "在欧洲传统中，薰衣草似乎与爱情天然相关。薰衣草的花语是“等待爱情”，薰衣草意味着一种含蓄的示爱，一种坚定的承诺，历经磨难而终能携子之手。");
        ai[0] = a;
        AuctionItems a2 = new AuctionItems(2, "风信子", 55, "蓝色", "A remaining memory！", "在英国，蓝色风信子一直是婚礼中新娘捧花或饰花不可或缺的代表新人的纯洁，祈望带来幸福。");
        ai[1] = a2;
        AuctionItems a3 = new AuctionItems(3, "百合", 40, "白色", "Purity,Solemn,have mutual affinity！", "受到百合花祝福的人具有单纯天真的性格，集众人宠爱于一身，不过光凭这一点并不能平静度过一生，必须具备自制力，抵抗外界的诱惑，才能保持不被污染的纯真。");
        ai[2] = a3;
        AuctionItems a4 = new AuctionItems(4, "向日葵", 45, "黄色", "Belief,loyal,a silent love！", "向日葵的花语是信念、光辉、高傲、忠诚、爱慕，寓意是沉默的爱，代表着勇敢地去追求自己想要的幸福。");
        ai[3] = a4;
        AuctionItems a5 = new AuctionItems(5, "红玫瑰", 80, "红色", "I LOVE YOU,passionate love！", "真正的红玫瑰是不存在的。切花红玫瑰实为月季。花草茶红玫瑰多为平阴玫瑰，严格来讲不是红色而是紫红。红玫瑰是保加利亚的国花。");
        ai[4] = a5;

        //循环判断数组是否为空
        for (int i = 0; i < ai.length; i++) {
            //如果不为空，则展示物品
            if (ai[i] != null) {
                System.out.println("序号:" + ai[i].getNumber() + "，" + "花名:" + ai[i].getFname() + "，" + "价格:" + ai[i].getPrice() + "，"
                        + "花色:" + ai[i].getColor() + "，" + "花语:" + ai[i].getFlanguage());
                continue;
            }
        }
        return "";
    }

    //（2）判断用户是否选择的是序号展示
    public String selectByNumber() {
        for (int i = 0; i < ai.length; i++) {
            if (ai[i] != null) {
                System.out.println("序号:" + ai[i].getNumber());
            }
        }
        return "";
    }

    //展示用户按序号选择的物品详情
    public String selectByShow(int f) {
        //判断用户输入的序号是否正确
        if (f > 0 && f < 6) {
            for (f = f; f < ai.length + 1; f++) {
                //如果不为空，则展示物品
                if (ai[f - 1] != null) {
                    return "序号:" + ai[f - 1].getNumber() + "，" + "花名:" + ai[f - 1].getFname() + "，" + "介绍:" + ai[f - 1].getFintroduction();
                }
            }
        }
        return null;
    }

    //（3）判断用户是否选择的是名称展示
    public String selectByNumber2() {
        for (int i = 0; i < ai.length; i++) {
            if (ai[i] != null) {
                System.out.println("花名:" + ai[i].getFname());
            }
        }
        return "";
    }

    //展示用户按名称选择的物品详情
    public String selectByShow2(String f2) {
        //判断用户输入的名称是否与数组中的相同
        for (int i = 0; i < ai.length; i++) {
            if (ai[i] != null) {
                if (ai[i].getFname().equals(f2)) {
                    return "序号:" + ai[i].getNumber() + "，" + "花名:" + ai[i].getFname() + "，" + "介绍:" + ai[i].getFintroduction();
                }
            }
        }
        return null;
    }

    //（4）拍卖品金额排名从高到低
    public String paixu() {
        if(ai.length < 2) return "";
        for (int i = 0; i < ai.length - 1; i++) {
            for (int j = 0; j < ai.length - 1 - i; j++) {
                if ((ai[j].getPrice() < ai[j + 1].getPrice())) {
                    AuctionItems dd = ai[j+1];
                    ai[j+1] = ai[j];
                    ai[j] = dd;
                }
            }
        }
        //输出排好序之后的内容
        for (int r = 0;r<ai.length;r++) {
            System.out.println("序号:" + ai[r].getNumber() + "，" + "花名:" + ai[r].getFname() + "，" + "价格:" + ai[r].getPrice() + "，"
                    + "花色:" + ai[r].getColor() + "，" + "花语:" + ai[r].getFlanguage());
        }
        return "";
    }
}
