package com.itdr.basic.textdemo1;

public class Zc6 {
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
