package com.imewp.demo05.String;

import javax.sound.midi.Soundbank;

public class StringConstructorExample2 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = new String(a);
        System.out.println("3个字符串对象的内容：");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        if (a == b) {
            System.out.println("a与b代表同一个字符串对象");
        } else {
            System.out.println("a与b代表不同一个字符串对象");
        }
        if (a == c) {
            System.out.println("a与c代表同一个字符串对象");
        } else {
            System.out.println("a与c代表不同一个字符串对象");
        }
    }
}
