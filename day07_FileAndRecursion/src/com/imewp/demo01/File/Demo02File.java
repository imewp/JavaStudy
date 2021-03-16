package com.imewp.demo01.File;

import java.io.File;

public class Demo02File {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show01() {
        File file = new File("C:\\Users\\15728\\Desktop\\暑假期间\\JavaStudy\\day07_FileAndRecursion");
        System.out.println(file);
    }

    /*
        long length()------返回由此抽象路径名表示的文件的长度。
        获取的是构造方式指定的文件的大小，以字节为单位
        注意：
            文件夹是没有大小概念的，不能获取文件夹的大小
            如果构造方式中给出的路径不存在，那么length()返回0
    */
    private static void show02() {
        File f1 = new File("C:\\Users\\15728\\Desktop\\JavaDemo");
        System.out.println(f1.length());

        File f2 = new File("C:\\Users\\15728\\Pictures\\Saved Pictures\\20160117125534_dveGH.jpeg");
        System.out.println(f2.length());

        File f3 = new File("C:\\Users\\15728\\Pictures\\Saved Pictures\\a.jpeg");
        System.out.println(f3.length());
    }

}
