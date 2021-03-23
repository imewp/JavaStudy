package com.imewp.demo05.Writer;

import java.io.FileWriter;
import java.io.IOException;

public class Demo03Writer {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("day08_IOAndProperties/src/com/imewp/demo05/Writer/a.txt");
            char[] c = {'a', 'b', 'c', 'd', 'e'};
            fw.write(c);
            fw.write("\r\n");

            fw.write(c, 1, 3);
            fw.write("\r\n");

            String str = "你好，程序员";
            fw.write(str);
            fw.write("\r\n");

            fw.write(str, 0, 2);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
