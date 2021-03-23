package com.imewp.demo07.BufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
    java.io.BufferedReader extends Reader

    继承自父类的共性成员方法：
        abstract void close()  关闭流并释放与之相关联的任何系统资源。
        int read()  读取单个字符并返回
        int read(char[] cbuf)  一次读取多个字符，将字符读入数组。
        abstract int read(char[] cbuf, int off, int len)   将字符读入数组的一部分。

    构造方法：
        BufferedReader(Reader in) 创建使用默认大小的输入缓冲区的缓冲字符输入流。
        BufferedReader(Reader in, int sz) 创建使用指定大小的输入缓冲区的缓冲字符输入流。
         参数：
            Writer out：字符输入流。我们可以传递FileReader，缓冲流会给FileReader增加一个缓冲区，提高FileReader的写入效率
            int sz：指定缓冲区的大小，不写默认大小

    特有的成员方法：
        String readLine() 读一行文字。读取一行数据
            行的终止符号：一行被视为由换行符（'\ n'），回车符（'\ r'）中的任何一个或随后的换行符（'\r\n'）终止。
            返回值：包含行的内容的字符串，不包括任何行终止字符，如果已达到流的末尾，则为null

    使用步骤：
        1. 创建字符缓冲输入流对象，构造方法中传递字符输入流
        2. 使用字符缓冲输入流对象中的方法read()/readline()读取文本
        3. 释放资源。


*/
public class Demo04BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day08_IOAndProperties/src/com/imewp/test.txt"));

        String s = "";
        while ((s = br.readLine()) != null)
            System.out.println(s);
        br.close();
    }
}
