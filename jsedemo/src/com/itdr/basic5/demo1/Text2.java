package com.itdr.basic5.demo1;
import java.util.Scanner;
public class Text2 {
    public static void main(String[] args) {
        //1
        /*String s = "helloworld";
        System.out.println("s.length:"+s.length());
        System.out.println("-----------");

        System.out.println("charAt:"+s.charAt(7));
        System.out.println("-----------");

        System.out.println("indexOf:"+s.indexOf('l'));
        System.out.println("-----------");

        System.out.println("indexOf:"+s.indexOf("owo"));
        System.out.println("------");

        System.out.println("idexOf:"+s.indexOf('l',4));
        System.out.println("idexOf:"+s.indexOf('k',4));
        System.out.println("idexOf:"+s.indexOf('l',40));
        System.out.println("----------");

        System.out.println("substring:"+s.substring(5));
        System.out.println("substring:"+s.substring(0));
        System.out.println("----------");

        System.out.println("substring:"+s.substring(3,8));
        System.out.println("substring:"+s.substring(0,s.length()));*/

        //2
        /*String s = "helloWORLD";

        String s1 = s.substring(0,1);
        String s2 = s.substring(1);
        String s3 = s1.toUpperCase();
        String s4 = s2.toLowerCase();
        String s5 = s3.concat(s4);
        System.out.println(s5);

        String result = s.substring(0,1).toUpperCase()
                .concat(s.substring(1).toLowerCase());
        System.out.println(result);*/

        //3
        /*String s1 = "helloworld";
        String s2 = s1.replace('l','k');
        String s3 = s1.replace("owo","ak47");
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("s3:"+s3);
        System.out.println("------");

        String s4 = " hello world  ";
        String s5 = s4.trim();
        System.out.println("s4:"+s4+"---");
        System.out.println("s5:"+s5+"---");

        String s6 = "hello";
        String s7 = "hello";
        String s8 = "abc";
        String s9 = "xyz";
        System.out.println(s6.compareTo(s7));
        System.out.println(s6.compareTo(s8));
        System.out.println(s6.compareTo(s9));*/

        //4
        /*int[] arr = {1,2,3};
        String  s = "";
        s += "[";

        for(int x = 0;x < arr.length; x++){
            if(x == arr.length - 1){
                s += arr[x];
                s += "]";
            }else{
                s += arr[x];
                s += ",";
            }
        }
        System.out.println("最终的字符串是："+ s);*/

        //5
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        String s = myReverse(line);
        System.out.println("实现功能后的结果是：" + s);*/

        //6
        String maxString = "woaijava";
        String minString = "java";
        int count = getCount(maxString,minString);
        System.out.println("Java在大串中出现了：" + count + "次");

    }
    /*public static String myReverse(String s){  //5
        String result = "";
        char[] chs = s.toCharArray();
        for(int x = chs.length - 1;x >= 0; x++){
            result += chs[x];
        }
        return result;
    }*/

    public static int getCount(String maxString,String minString){  //6
        int count = 0;
        int index = maxString.indexOf(minString);

        while(index != -1){
            count++;
            int startIndex = index + minString.length();
            maxString = maxString.substring(startIndex);
            index = maxString.indexOf(minString);
        }
        return count;
    }

}
