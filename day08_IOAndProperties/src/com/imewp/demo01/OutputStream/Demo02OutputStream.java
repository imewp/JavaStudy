package com.imewp.demo01.OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("day08_IOAndProperties/src/com/imewp/demo01/OutputStream/b.txt"));

        /*
            void write(byte[] b)   将 b.length字节从指定的字节数组写入此输出流。
                一次写多个字节：
                    如果写的第一个字节是正数(0-127),那么显示的时候会查询ASCII表
                    如果写的第一个字节是负数,那第一个字节会和第二个字节,两个字节组成一个中文显示,查询系统默认码表(GBK)
        */

        byte[] bytes = {65, 66, 68, 69, 71};
        fos.write(bytes);

        /*
            写入字符的方法：可以使用String类中的方法把字符串，转换成字节数组
            byte[] getBytes() 使用平台的默认字符集将此 String编码为字节序列，将结果存储到新的字节数组中。
        */
        byte[] bytes1 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes1));
        fos.write(bytes1);

        fos.close();

    }
}
