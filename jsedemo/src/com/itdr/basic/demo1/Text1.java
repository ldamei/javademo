package com.itdr.basic.demo1;

public class Text1 {
    public static void main(String[] args){
        //1.找问题
       /* byte b = 10;
        int i = 100;
        System.out.println(b+i);
        byte bb = b + i; // b+i的值为int型，无法赋值给byte
        System.out.println(bb);
        int j = b + i;
        System.out.println(j);*/

        //2.找问题
        /*byte b1=3,b2=4,b;
        b=b1+b2;  //b1+b2的值为int型，无法赋值给byte
        b=3+4;*/

        //3.找问题
//        byte b = 130; 130超出byte范围，如果想让赋值正确，应该强转

        //4.输出程序结果
        /*System.out.println('a');
        System.out.println('a'+1);
        System.out.println("hello"+'a'+1);
        System.out.println('a'+1+"hello");
        System.out.println("5+5="+5+5);
        System.out.println(5+5+"=5+5");*/

        //5.计算a,b,c的值
        /*int a = 10;
        int b = 10;
        int c = 10;
        a = b++;
        c = --a;
        b = ++a;
        a = c--;*/

        //6.计算a,b的值
        /*int a = 4;
        int b = (a++)+(++a)+(a*10);*/

        //7.正确
        /*int a = 10;
        int b = 10;
        System.out.println(a==b);
        System.out.println(a=b);*/

        //8.
         /*int x = 10;
        int y = 10;
        boolean flag = (x == y);
        boolean flag = (x = y); //布尔类型只能判断int类型，不能把int赋值给布尔*/

         //9.正确
        /*boolean b1 = true;
        boolean b2 = false;
        boolean b3 = (b1 == b2);
        boolean b4 = (b1 = b2);*/

        //10.获取两个数中较大数
       /* int a = 2;
        int b = 5;
        System.out.println((b>a)?b:a);*/


    }
}
