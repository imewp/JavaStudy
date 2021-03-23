package com.imewp.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02CloseAndFlush {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day08_IOAndProperties/src/com/imewp/demo05/Writer/a.txt");

        fw.write(97);
        fw.flush();

        //刷新之后流可以继续使用
        fw.write(98);
        fw.close();

        //close方法之后流已经关闭了，已经从内存中消失了，流就不能再使用了
        fw.write(99);
    }
}
