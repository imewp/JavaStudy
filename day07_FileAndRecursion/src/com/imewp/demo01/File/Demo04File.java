package com.imewp.demo01.File;

/*
    File类遍历（文件夹）目录功能
    String[] list() 返回一个字符串数组，命名由此抽象路径名表示的目录中的文件和目录。
    File[] listFiles() 返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。
    注意：
        1. list()方法和方法listFiles()方法遍历的是构造方法中给出的目录
        2. 如果构造方式中给出的目录的路径不存在，会抛出空指针异常
        3. 如果构造方法中给出的路径不是一个目录，也会抛出空指针异常
*/

import java.io.File;

public class Demo04File {
    public static void main(String[] args) {
        show02();
    }

    // File[] listFiles() 返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。
    // 遍历构造方法中给出的目录，会获取目录中所有文件/文件夹封装为File对象，多个File对象存储到File数组中
    private static void show02() {
        File f1 = new File("day07_FileAndRecursion\\src\\com\\imewp\\demo01\\File");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
    }

    // String[] list() 返回一个字符串数组，命名由此抽象路径名表示的目录中的文件和目录。
    // 便利构造方法中给出的目录，会获取目录中所有文件/文件夹的名称，把获取到的多个名称存储到一个String类型的数组中
    private static void show01() {
        File f1 = new File("day07_FileAndRecursion\\src\\com\\imewp\\demo01\\File");
        String[] arr = f1.list();
        for (String filename : arr) {
            System.out.println(filename);
        }
    }
}
