package com.itdr.basic.demo4;

public class Users2 {
    private String uname;//用户名
    private int psd;//密码
    private String sx;//生肖
    private int month;//月份
    private String xz;//星座

    //有参构造方法
    public Users2(String uname,int psd,String sx,int mon,String xz){
        this.uname = uname;
        this.psd = psd;
        this.sx = sx;
        this.month = mon;
        this.xz = xz;
    }
    /*//成员方法
    public String getUname(){
        return this.uname;
    }
    public int getPsd(){
        return this.psd;
    }
    public String getSx(){
        return this.sx;
    }
    public int getMonth(){
        return this.month;
    }
    public String getXz(){
        return this.xz;
    }*/

    /*public void setUname(String uname){
        this.uname = uname;
    }*/
}
