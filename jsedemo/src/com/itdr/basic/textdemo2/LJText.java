package com.itdr.basic.textdemo2;

public class LJText {
    //灵境初始化
    //存放用户
    static Users[] users = new Users[1000];
    //存放2个门派和该门派对应的人数
    static String[] mps2 = new String[2];
    static int[] mpnum = new int[10];
    static {
        mps2[0] = "java";
        mps2[1] = "html";
    }

    //灵境主入口
    public static void main(String[] args){

        /*int i = pdAge(new Users("1","2","3",4));
        System.out.println(i);*/

        //记录进入灵境的人
        Users us = new Users("1","2","3",4);
        int i2 = saveUsers(us,users);
        System.out.println(i2);

        //判断进入人所在门派人数是否超过10
        for(int i = 0;i<10;i++){
            int n = pdMPNum(us,mps2,mpnum);
            System.out.println(n);
        }
    }

    //判断进入灵境之人的年龄是否符合
    public static int pdAge(Users u){       //人的地址
        if(u != null){
            if(u.age >=10 && u.age <=30){
                return 1;
            }
        }
        return -1;
    }
    //记录进入灵境的人
    public static int saveUsers(Users u,Users[] uar){
        //判断该用户是否存在
        for(int i = 0;i<uar.length;i++){
            if(uar[i] == null){
                uar[i] = u;
                    return 1;
            }
        }
        return -1;
    }

    //判断进入人所在门派人数是否超过10
    public static int pdMPNum(Users u,String[] mp,int[] mpnum){
        if(u != null){
            for(int i = 0;i<mp.length;i++){
                if(mp[i] != null && mp[i].equals(u.uname)){
                    if(mpnum[i] <=10){
                        mpnum[i]++;
                        return 1;
                    }
                }
            }
        }
        return -1;
    }
}
