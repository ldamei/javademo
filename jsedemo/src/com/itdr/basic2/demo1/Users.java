package com.itdr.basic2.demo1;

public class Users {
    private String userName;
    private String passWord;

    public String getUserName() {
        return this.userName;
    }
    public void setUserName(String userNa) {
        this.userName = userNa;
    }

    public String getPassWord() {
        return this.passWord;
    }
    public void setPassWord(String passWo) {
        this.passWord = passWo;
    }

    public String show(){
        String s = "userName:"+this.userName+"passWord"+this.passWord;
        return s;
    }
}
