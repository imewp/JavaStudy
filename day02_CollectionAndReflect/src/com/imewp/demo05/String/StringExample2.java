package com.imewp.demo05.String;

public class StringExample2 {
    public static void main(String[] args) {
        String path = "C:\\test\\java\\Hello.java";
        System.out.println("要处理的字符串是" + path);
        int count = 0, fromIndex = 0, i;
        for (; ; ) {
            i = path.indexOf('\\', fromIndex);
            if (i < 0) {
                break;
            }
            fromIndex = i + 1;
            count++;
            System.out.println("字符串中第" + count + "个\\字符的位置是" + i);
        }

        //从后面往前搜索字符'\'
        System.out.println("字符串中后数第一个\\字符出现的位置是："+path.lastIndexOf('\\'));
    }
}
