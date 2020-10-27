package com.imewp.demo05.String;

public class StringConstructorExample1 {
    public static void main(String[] args) {
        char[] text = {'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd',};
        String a = new String(text);    //所创建的字符串对象的内容完全从text数组复制
        String b = new String(text, 0, 5);//从text数组的第0个位置开始，复制5个字符
        String c = new String(a);   //创建字符串a的副本
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
