package com.imewp.demo02.Recursion;

import java.io.File;

public class Demo02 {
    public static void main(String[] args) {
        File f1 = new File("day07_FileAndRecursion\\src\\com\\imewp\\demo02\\Recursion");
        getAllFile1(f1);
    }

    public static void getAllFile(File file) {
        if (file.isFile()) {
            System.out.println(file);
            return;
        }
        File[] files = file.listFiles();
        for (File file1 : files) {
            getAllFile(file1);
        }
    }

    public static void getAllFile1(File file) {
        System.out.println(file);
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory())
                getAllFile1(file1);
            System.out.println(file1);
        }
    }
}
