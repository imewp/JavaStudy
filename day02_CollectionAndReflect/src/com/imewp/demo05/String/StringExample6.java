package com.imewp.demo05.String;

public class StringExample6 {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.toLowerCase(); //创建新的大写格式的字符串对象
        String str3 = str1.toUpperCase();//创建新的小写格式的字符串对象
        System.out.println("str1的小写格式新字符串str2是" + str2);
        System.out.println("str1的大写格式新字符串str3是" + str3);
        String str4 = str1.concat(str1);
        String str5 = str1.concat(str2);
        System.out.println("str1与自己str1连接后得到的新字符串：" + str4);
        System.out.println("str1与str2连接后得到的新字符串：" + str5);
    }
}
