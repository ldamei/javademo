package com.itdr.games.auctiondemo.controller;

import com.itdr.games.auctiondemo.service.AuctionItemService;

public class AuctionItemController {
    AuctionItemService ais = new AuctionItemService();

    //（1）展示所有拍卖品
    public String show() {
        String s = ais.show();
        return s;
    }

    //（2）判断用户是否选择的是序号展示
    public String selectByNumber() {
        String s = ais.selectByNumber();
        return s;
    }
    //展示用户按序号选择的物品详情
    public String selectByShow(int f) {
        String s = ais.selectByShow(f);
        return s;
    }

    //（3）判断用户是否选择的是名称展示
    public String selectByNumber2() {
        String s = ais.selectByNumber2();
        return s;
    }
    //展示用户按名称选择的物品详情
    public String selectByShow2(String f2) {
        String s = ais.selectByShow2(f2);
        return s;
    }

    //拍卖品金额排名从高到低
    public String paixu(){
        String s = ais.paixu();
        return s;
    }

}
