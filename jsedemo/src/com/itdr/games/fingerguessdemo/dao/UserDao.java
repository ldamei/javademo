package com.itdr.games.fingerguessdemo.dao;

import com.itdr.games.fingerguessdemo.pojo.Users;

public class UserDao {
    private static Users[] users;
    static{
        users = new Users[10];
    }

    //用户注册
    //根据用户名查找一个用户
    public Users selectByName(String name){
        for(int i = 0 ;i < users.length;i++){
            if(users[i] != null){
                if(users[i].getUname().equals(name)){
                    return users[i];
                }
            }
        }
        return null;
    }

    //把新用户放入数组中
    public int addOne(Users u){
        for(int i = 0 ;i < users.length;i++){
            if(users[i] == null){
                users[i] = u;
                return 1;
            }
        }
        return 0;
    }
}
