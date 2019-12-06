package com.itdr.basic2.demo1;
import java.util.Scanner;
public class UsersTest {
    public static void main(String[] args){
        Users chaoji = new Users();
        chaoji.setUserName("ljm");
        chaoji.setPassWord("0723");

        //用户登录过程
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String a = sc.next();
        System.out.println("请输入密码：");
        String b = sc.next();

        //比较是否存在该用户
        Users u = login(a,b,chaoji);
        if(u != null){
            System.out.println(u.show());
        }else{
            System.out.println("登录失败");
        }
    }

    //用户登录
    public static Users login(String uname,String psd,Users chaoji){
        //判断参数是否为空
        //判断用户是否存在
        if(uname.equals(chaoji.getUserName()) && psd.equals(chaoji.getPassWord())){
            return chaoji;
        }else{
            return null;
        }
    }
}
