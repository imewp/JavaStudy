package com.imewp.demo01.File;

import java.io.File;
import java.io.IOException;

public class Demo03File {
    public static void main(String[] args) throws IOException {
        show03();
    }

    /*
        boolean delete() 删除由此抽象路径名表示的文件或目录。
        注意：
            delete方法是直接在硬盘删除文件/文件夹，不走回收站，删除要谨慎。
    */
    private static void show03() {
        File f1 = new File("day07_FileAndRecursion\\src\\com\\imewp\\demo01\\File\\111");
        System.out.println(f1.delete());;
    }

    /*
        boolean mkdir() 创建由此抽象路径名命名的目录。
        boolean mkdirs() 创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录。
         创建文件夹的路径和名称在构造方法中给出（构造方法的参数）
            true：文件夹不存在，创建文件
            false：文件夹存在，不会创建；构造方法中给出的路径不存在返回false
        注意：
            1. 此方法只能创建文件夹，不能创建文件
    */
    private static void show02() {
        File f1 = new File("day07_FileAndRecursion\\src\\com\\imewp\\demo01\\File\\aaa");
        boolean b1 = f1.mkdir();
        System.out.println("b1:" + b1);

        File f2 = new File("day07_FileAndRecursion\\src\\com\\imewp\\demo01\\File\\111\\222\\333");
        boolean b2 = f2.mkdirs();
        System.out.println("b2:" + b2);
    }


    /*
        boolean createNewFile() 当且仅当具有该名称的文件尚不存在时，原子地创建一个由该抽象路径名命名的新的空文件。
        创建文件的路径和名称在构造方法中给出（构造方法的参数）
            true：文件不存在，创建文件
            false：文件存在，不会创建
        注意：
            1. 此方法只能创建文件，不能创建文件夹
            2. 创建文件的路径必须存在，否则会抛出异常
    */
    private static void show01() throws IOException {
        File f1 = new File("day07_FileAndRecursion\\src\\com\\imewp\\demo01\\File\\b.txt");
        boolean file = f1.createNewFile();
        System.out.println(file);
    }
}
