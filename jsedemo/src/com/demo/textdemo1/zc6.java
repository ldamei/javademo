package com.demo.textdemo1;

public class zc6 {
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;
        boolean c = false;
        boolean d = true;
        System.out.println((a&b&c&d));
        System.out.println((a|b&c|d));
        System.out.println(!(a||b&c&d));
        System.out.println((a&&b|c^d));
    }
}
