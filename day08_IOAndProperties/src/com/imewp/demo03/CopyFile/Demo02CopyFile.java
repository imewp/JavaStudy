package com.imewp.demo03.CopyFile;

import java.io.*;

/*
    文件复制：
        步骤：
            1. 创建字节缓冲输入流对象，构造方法中传递字节输入流
            2. 创建字节缓冲输出流对象，构造方法中传递字节输出流
            3. 使用字节缓冲输入流对象中的read方法，读取文件
            4. 使用字节缓冲输出流中的方法write，把读取的数据写入到内部缓冲区中
            5. 释放资源（会先把缓冲区中的数据，刷新到文件中）
*/
public class Demo02CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();        //测试读取写入的效率

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day08_IOAndProperties/src/com/imewp/1.pdf"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day08_IOAndProperties/src/com/imewp/demo03/CopyFile/copy.pdf"));

        //复制文件共耗时：1015毫秒
      /*  int len = 0;
        while ((len = bis.read()) != -1)
            bos.write(len);*/

        //复制文件共耗时：110毫秒
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1)
            bos.write(bytes, 0, len);

        bos.close();
        bis.close();

        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时：" + (e - s) + "毫秒");
    }
}
