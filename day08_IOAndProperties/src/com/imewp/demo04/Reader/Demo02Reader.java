package com.imewp.demo04.Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
    java.io.Reader：字符输入流，是字符输入流的最顶层的父类，定义了一些共性的成员方法，是一个抽象类

    共性的成员方法；
        abstract void close()  关闭流并释放与之相关联的任何系统资源。
        int read()  读取单个字符并返回
        int read(char[] cbuf)  一次读取多个字符，将字符读入数组。
        abstract int read(char[] cbuf, int off, int len)   将字符读入数组的一部分。

    java.io.FileReader extends InputStreamReader extends Reader
    FileReader：文件字符输入流
        作用：把硬盘文件中的数据以字符的方式读取到内存中
        构造方法：
            FileReader(File file)  创建一个新的 FileReader ，给出 File读取。
            FileReader(String fileName)  创建一个新的 FileReader ，给定要读取的文件的名称。
            作用：
                1. 创建一个FileReader对象
                2. 会把FileReader对象指向要读取的文件
    字符输入流的使用步骤：
        1. 创建一个FileReader对象，构造方法中绑定要读取的数据源
        2. 使用FileReader对象中的方法read，读取文件
        3. 释放资源
*/
public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day08_IOAndProperties/src/com/imewp/test.txt");

        // int read()  读取单个字符并返回
/*        int len = 0;
        while ((len = fr.read()) != -1) {
            System.out.print((char) len);
        }*/

        //int read(char[] cbuf)  一次读取多个字符，将字符读入数组。
        char[] cs = new char[1024];
        int len = 0;
        while ((len = fr.read(cs)) != -1) {
            /*
                String类的构造方法
                    String(char[] value)      把字符数组转换为字符串
                    String(char[] value, int offset, int count) 把字符数组的一部分转化为字符串  offset：数组的开始索引  count：转换的个数
            */
            System.out.println(new String(cs, 0, len));
        }

        fr.close();
    }
}
