package com.itdr.games.auctiondemo.service;

import com.itdr.games.auctiondemo.dao.AuctionItemDao;

public class AuctionItemService {
    AuctionItemDao aid = new AuctionItemDao();

    //（1）展示所有物品
    public String show() {
        String show = aid.show();
        //判断存放花的数组是否为空
        if (show != null) {
            return show;
        }
        return "";
    }

    //（2）判断用户是否选择的是序号展示
    public String selectByNumber(){
        String select = aid.selectByNumber();
        if(select != null){
            return select;
        }
        return "";
    }
    //展示用户按序号选择的物品详情
    public String selectByShow(int f) {
        String select = aid.selectByShow(f);
        if (select != null) {
            return select;
        }
        return "你选择的拍卖品不存在";
    }

    //（3）判断用户是否选择的是名称展示
    public String selectByNumber2(){
        String select = aid.selectByNumber2();
        if(select != null){
            return select;
        }
        return "";
    }
    //展示用户按名称选择的物品详情
    public String selectByShow2(String f2) {
        String select = aid.selectByShow2(f2);
        if (select != null) {
            return select;
        }
        return "你选择的拍卖品不存在";
    }

    //拍卖品金额排名从高到低
    public String paixu(){
        String paixu = aid.paixu();
        if(paixu != ""){
            return paixu;
        }
        return "";
    }
}
