package com.imewp.demo05.Writer;

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

*/
public class Demo01Writer {
}
