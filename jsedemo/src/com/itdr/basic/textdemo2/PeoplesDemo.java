package com.itdr.basic.textdemo2;

import java.util.Scanner;
public class PeoplesDemo {
    public static void main(String[] args){
        //程序初始化
        Scanner sc = new Scanner(System.in);
        Peoples[] uarr = new Peoples[10];
        Beast[] barr = new Beast[10];

        //进入灵境要求
        System.out.println("请分别输入您的姓名、门派、性别和年龄");
        String name = sc.next();
        String sect = sc.next();
        String sex = sc.next();
        int age = sc.nextInt();

        int m = require(name,sect,sex,age,uarr);
        if(m == 1){
            System.out.println("您已成功进入灵境，请选出您喜欢的灵兽序号");
        }else{
            System.out.println("您输入的信息有误");
        }

        //选择灵兽
        Beast b1 = new Beast();
        Beast b2 = new Beast();
        b1.bname = "灵兽一号";
        b1.category = "金";
        b1.skill = "飞";
        b2.bname = "灵兽二号";
        b2.category = "木";
        b2.skill = "跳";

        Beast[] ba = new Beast[5];
        barr[0] = b1;
        barr[1] = b2;

        int n = 1;
        while( n == 1){
            for(int i = 0;i<barr.length;i++){
                if(barr[i] != null){
                    System.out.println("序号:"+i+"灵兽名称:"+barr[i].bname+"灵兽属性:"+barr[i].category+"灵兽技能："+barr[i].skill);
                }
            }
            System.out.println("请选择喜欢的灵兽序号：");
            int a = sc.nextInt();
            //输出用户喜欢的灵兽
            if(a<barr.length && a>=0){
                System.out.println("序号:"+a+"灵兽名称:"+barr[a].bname+"灵兽属性:"+barr[a].category+"灵兽技能："+barr[a].skill);
            }else{
                System.out.println("你选择的灵兽"+a+"不存在");
            }
            System.out.println("您要重新选择吗？1继续/0取消");
            n = sc.nextInt();
        }
    }

    //进入灵境要求
    public static int require(String name,String sect,String sex,int age,Peoples[] uarr){
        //创建一个用户对象
        Peoples p = new Peoples();
        //给对象属性赋值
        p.name = name;
        p.sect = sect;
        p.sex = sex;
        p.age = age;
        //保存对象（在数组中的空的位置上保存）
        if(age <10 || age >30){
            return -1;
        }else{
            for(int i = 0;i<uarr.length;i++){
                if(uarr[i] == null){
                    uarr[i] = p;
                    return 1;
                }
            }
            return -1;
        }
    }


}
