package com.imewp.demo02.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Demo01Foreach {
    /*
         增强for循环：底层使用也是迭代器，使用for循环的格式，简化了迭代器的写法
    */
    public static void main(String[] args) {

        demo01();
        System.out.println();
        demo02();
    }

    private static void demo02() {
        List<String> strList = new ArrayList<String>();

        strList.add("Java");
        strList.add("is");
        strList.add("fun!");

        for (String s : strList) {
            System.out.print(s + " ");
        }
    }

    private static void demo01() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
