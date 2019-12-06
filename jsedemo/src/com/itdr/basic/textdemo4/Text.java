package com.itdr.basic.textdemo4;
import java.util.Scanner;
/**
 * @author ldamei
 * @date 2019/12/5 15:06
 */
public class Text {

    static Users[] users = new Users[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来到祁云山");
        System.out.println("请输入用户名");
        String uname = sc.next();
        Users u = new Users();
        u.setUname(uname);
        String name = u.getUname();
        for(int i = 0;i < users.length;i++){
            if(users[i] == null){
                users[i] = u;
            }
        }
        System.out.println("用户登录成功");
    }


}
