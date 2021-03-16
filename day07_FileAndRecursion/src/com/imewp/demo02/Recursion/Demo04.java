package com.imewp.demo02.Recursion;

import java.io.File;
import java.io.FileFilter;

public class Demo04 {
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
    //定义一个方法，参数传递File类型的目录
    //方法中对目录进行遍历
    public static void getAllFile1(File file) {
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".java"))
                    return true;
                return false;
            }
        });
        for (File file1 : files) {
            if (file1.isDirectory())
                getAllFile1(file1);
            else
                System.out.println(file1);
        }
    }
}
