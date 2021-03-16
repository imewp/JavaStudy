package com.imewp.demo01.OutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
     追加写/续写：使用两个参数的构造方法
        FileOutputStream(File file, boolean append) 创建文件输出流以写入由指定的 File对象表示的文件。
        FileOutputStream(String name, boolean append) 创建文件输出流以指定的名称写入文件。
    参数：
        boolean append：追加写开关
            true：创建对象不会覆盖源文件，继续在文件的末尾追加写数据
            false：创建一个新文件，覆盖源文件

    写换行：写换行符号
        windows：\r\n
        linux：/n
        mac:/r
*/
public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("day08_IOAndProperties/src/com/imewp/demo01/OutputStream/c.txt"), true);
        for (int i = 0; i < 5; i++) {
            byte[] bytes = "你好".getBytes();
            fos.write(bytes);
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
