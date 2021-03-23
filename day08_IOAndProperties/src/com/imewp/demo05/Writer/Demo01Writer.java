package com.imewp.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
     java.io.Writer：字符输出流，是所有字符输出流的最顶层的父类，是一个抽象类

     共性的成员方法：
        void write(char[] cbuf) 写入一个字符数组。
        abstract void write(char[] cbuf, int off, int len) 写入字符数组的一部分。
        void write(int c) 写一个字符
        void write(String str) 写一个字符串
        void write(String str, int off, int len) 写一个字符串的一部分。
        abstract void close() 关闭流，先刷新。
        abstract void flush() 刷新流。

    java.io.FileWriter extends OutputStreamWriter extends Writer
    FileWriter：文件字符输出流
        作用：把内存中字符数据写入到文件中
        构造方法：
            FileWriter(File file)给一个File对象构造一个FileWriter对象。
            FileWriter(String fileName) 构造一个给定文件名的FileWriter对象。
            作用：
                1. 创建一个FileWriter对象
                2. 会根据构造方法中传递的文件/文件的路径，创建文件
                3. 会把FileWriter对象指向创建好的文件
    字符输出流的使用步骤：
        1. 创建一个FileWriter对象，构造方法中绑定要写入数据的目的地
        2. 使用FileWriter对象中的方法write，把数据写入到内存缓冲区内（字符转换为字节的过程）
        3. 使用FileWriter中的方法flush，把内存缓冲区中的数据，刷新到文件中
        3. 释放资源（会先把内存缓冲区中的数据刷新到文件中）

    flush方法和close方法的区别
        flush：刷新缓冲区，流对象可以继续使用。
        close：线栓行缓冲区，然后通知系统释放资源。流对象就不可以再被使用了。
*/
public class Demo01Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day08_IOAndProperties/src/com/imewp/demo05/Writer/a.txt");
        fw.write(97);
        //fw.flush();
        fw.close();

    }
}
