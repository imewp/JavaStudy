package com.imewp.demo02.InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
   java.io.InputStream：字节输入流
        这个抽象类是表示输入字节流的所有类的超类。

    定义了所有子类共性的方法：
        void close()  关闭此输入流并释放与流相关联的任何系统资源。
        abstract int read()  从输入流读取数据的下一个字节。
        int read(byte[] b)  从输入流读取一些字节数，并将它们存储到缓冲区 b 。
        int read(byte[] b, int off, int len) 从输入流读取最多 len字节的数据到一个字节数组。

    java.io.FileInputStream extends InputStream
        FileInputStream：文件字节输入流
            作用：把硬盘文件中的数据，读取到内存中使用

        构造方法：
            FileInputStream(File file) 通过打开与实际文件的连接创建一个 FileInputStream ，该文件由文件系统中的 File对象 file命名。
            FileInputStream(String name) 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的路径名 name命名。

            作用：
               1. 会创建一个FileInputStream对象
               2. 回把FileInputStream对象指针构造方法中要读取的文件
    读取数据的原理（硬盘--->内存）
        java程序--->JVM(java虚拟机)--->OS(操作系统)--->OS调用读数据的方法--->读取文件

    字节输入流的使用步骤：
        1. 创建一个FileInputStream对象，构造方法中绑定要读取的数据源
        2. 使用FileInputStream对象中的方法read，读取文件
        3. 释放资源

*/
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("day08_IOAndProperties/src/com/imewp/demo01/OutputStream/b.txt"));
        //abstract int read() 读取文件中的一个字节并返回，读取到文件的末尾返回-1

        /*int len = fis.read();
        System.out.println(len);
        System.out.println(fis.read());*/

        int len = 0;
        while ((len = fis.read()) != -1)
            System.out.println((char)len);


        fis.close();
    }
}
