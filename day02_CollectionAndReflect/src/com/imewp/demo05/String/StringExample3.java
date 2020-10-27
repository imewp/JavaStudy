package com.imewp.demo05.String;

public class StringExample3 {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = "helloworld";
        String str3 = "Hello";
        String str4 = "World";
        if (str1.equals(str2) == true) {    //判断两个字符串内容是否相同（区分大小写）
            System.out.println(str1 + "与" + str2 + "的内容是否相同（区分大小写）");
        } else {
            System.out.println(str1 + "与" + str2 + "的内容不相同（区分大小写）");
        }

        if (str1.equalsIgnoreCase(str2) == true) {  //比较字符串内容是否相同（不区分大小写）
            System.out.println(str1 + "与" + "的内容相同（不区分大小写）");
        } else {
            System.out.println(str1 + "与" + str2 + "的内容不相同（区分大小写）");
        }

        if (str1.startsWith(str3) == true) {
            System.out.println("字符串" + str1 + "以" + str3 + "开始");
        } else {
            System.out.println("字符串" + str1 + "不以" + str3 + "开始");
        }

        if (str1.endsWith(str4) == true) {
            System.out.println("字符串" + str1 + "以" + str4 + "结尾");
        } else {
            System.out.println("字符串" + str1 + "不以" + str4 + "结尾");
        }

        int result = str3.compareTo(str4);
        if (result > 0) {
            System.out.println("按照字典顺序：字符串" + str3 + "排在" + str4 + "之后");
        } else if (result < 0) {
            System.out.println("按照字典顺序：字符串" + str3 + "排在" + str4 + "之前");
        } else {
            System.out.println("按照字典顺序：字符串" + str3 + "排在" + str4 + "排序相同");
        }

    }
}
