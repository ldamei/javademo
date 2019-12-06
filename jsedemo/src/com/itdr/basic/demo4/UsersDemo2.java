package com.itdr.basic.demo4;
import java.util.Scanner;
public class UsersDemo2 {
    public static void main(String[] args){

        //初始化
        //存放用户信息
        Users2[] uarr = new Users2[10];
        Scanner sc = new Scanner(System.in);

        //用户注册
        System.out.println("请输入用户名、密码、生肖、月份、星座注册账号");
        String uname = sc.next();
        int psd = sc.nextInt();
        String sx = sc.next();
        int mon = sc.nextInt();
        String xz = sc.next();
        Users2 u = new Users2(uname,psd,sx,mon,xz);
//        u.setUname(uname);
        int m = register(uname,psd,sx,mon,xz,u,uarr);
        if(m == 1){
            System.out.println("注册成功");
        }else{
            System.out.println("注册失败");
        }
    }

    //用户注册
    public static int register(String uname,int psd,String sx,int mon,String xz,Users2 u,Users2[] uarr){
        for(int i = 0;i<uarr.length;i++){
            if(uarr[i] == null){
                uarr[i] = u;
                return 1;
            }
        }
        return -1;
    }
}
