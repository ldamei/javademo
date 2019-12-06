package com.itdr.basic5.demo1;
import java.util.Scanner;
public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*String[] s = new String[10];
        System.out.println("请输入：");
        String a = "";
        while(!a.equals("bye")){}
        while(sc.hasNextLine()){
            System.out.println("请输入：");
             a = sc.next();
            for (int i = 0 ;i < s.length;i++) {
                if(s[i] == null){
                     s[i]= a;
                     break;
                }
            }
        }
        for(int j = 0 ;j < s.length;j++){
            if(s[j] != null){
                System.out.println(s[j]);
            }
        }*/

        /*byte[] b = {97,98,99,100,101};
        String s2 = new String(b);
        System.out.println("s2:"+ s2);
        System.out.println("s2.length():"+ s2.length());
        System.out.println("-------");

        String s3 = new String(b,1,3);
        System.out.println("s3:"+s3);
        System.out.println("s3.length():"+s3.length());
        System.out.println("-------");

        char[] c = {'a','b','c','d','e','爱','林','亲'};
        String s4 = new String(c);
        System.out.println("s4:"+s4);
        System.out.println("s4.length():"+s4.length());
        System.out.println("-------");

        String s5 = new String(c,2,4);
        System.out.println("s5:"+s5);
        System.out.println("s5.length():"+s5.length());
        System.out.println("-------");*/

        /*String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("hello");
        String s4 = "hello";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        String s5 = "hello";
        String s6 = "hello";
        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));*/

        /*String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        System.out.println(s3 == s1+s2);
        System.out.println(s3.equals((s1+s2)));

        System.out.println(s3 == "hello"+"world");
        System.out.println(s3.equals("hello"+"world"));

        System.out.println(s3 =="helloworld");
        System.out.println(s3.equals("helloworld"));*/

        /*String s1 = "helloworld";
        String s2 = "helloworld";
        String s3 = "Helloworld";

        System.out.println("equals:"+s1.equals(s2));
        System.out.println("equals:"+s1.equals(s3));
        System.out.println("---------------");

        System.out.println("equals:"+s1.equalsIgnoreCase(s2));
        System.out.println("equals:"+s1.equalsIgnoreCase(s3));
        System.out.println("---------------");

        System.out.println("contains:"+s1.contains("hello"));
        System.out.println("contains:"+s1.contains("hw"));
        System.out.println("---------------");

        System.out.println("startsWith:"+s1.startsWith("h"));
        System.out.println("startsWith:"+s1.startsWith("hello"));
        System.out.println("startsWith:"+s1.startsWith("world"));
        System.out.println("---------------");

        System.out.println("isEmpty:"+s1.isEmpty());

        String s4 = "";
        String s5 = null;
        System.out.println("isEmpty:"+s4.isEmpty());
        System.out.println("isEmpty:"+s5.isEmpty());*/

        //打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
        // 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
        /*for(int n = 100; n>99 && n<1000; n++){
            int a = n % 10;  //个位
            int b = n / 10 % 10;  //十位
            int c = n / 100 % 10;  //百位

            if(a*a*a + b*b*b + c*c*c == n){
                System.out.println(n);
            }
        }*/


    }

}
