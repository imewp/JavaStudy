package com.imewp.demo02.InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    字节输入流一次读取多个字节的方法：
         int read(byte[] b) 从该输入流读取最多 b.length个字节的数据为字节数组。
     明确两件事情：
        1. 方法的参数 byte[] 的作用？
            起到缓冲的作用，存储每次读取到的多个字节
            数组的长度一般定义为1024（1kb）或者1024的整数倍
        2. 方法的返回值 int 是什么？
            每次读取到的有效字节个数

    String类的构造方法
        String(byte[] bytes)  通过使用平台的默认字符集解码指定的字节数组来构造新的 String 。
        String(byte[] bytes, int offset, int length)  通过使用平台的默认字符集解码指定的字节子阵列来构造新的 String 。
            offset：数组的开始索引   length：转换的字节个数
*/
public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("day08_IOAndProperties/src/com/imewp/demo01/OutputStream/a.txt"));
/*        byte[] bytes = new byte[3];
        int len = fis.read(bytes);  //读取的有效个数
        System.out.println(len);
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));*/

        byte[] bytes = new byte[1024];
        int len = 0;    //记录每次读取的有效字节个数
        while ((len = fis.read(bytes)) != -1)
            System.out.println(new String(bytes, 0, len));

        fis.close();
    }
}
