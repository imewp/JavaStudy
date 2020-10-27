package com.imewp.demo05.String;

public class StringExample5 {
    public static void main(String[] args) {
        String path = "\\test\\java\\Hello.java";
        int index = path.lastIndexOf("\\");
        String dir = path.substring(0, index);
        String file = path.substring(index + 1);
        System.out.println("文件名：" + file);
        System.out.println("文件所在目录：" + dir);
    }
}
