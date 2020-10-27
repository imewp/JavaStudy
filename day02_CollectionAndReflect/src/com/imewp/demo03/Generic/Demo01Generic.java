package com.imewp.demo03.Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
        show01();
        show02();

    }

    /*
       创建集合对象，使用泛型
       好处：
           1. 避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
           2. 把运行期异常（代码运行之后会抛出的异常），提升到了编译期（写代码的时候）
       弊端：
           泛型是什么类型，只能存储什么类型的数据
   */
    private static void show02() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("abc");
        //arr.add(1);

    }

    /*
        创建集合对象，不使用泛型
        好处：
            集合不使用泛型，默认的是object类型，可以存储任意类型的数据
        弊端：
            不安全，会引发异常
    */
    public static void show01() {
        ArrayList arr = new ArrayList();
        arr.add("abc");
        arr.add(123);

        Iterator itor = arr.iterator();
        while (itor.hasNext()) {
            System.out.print(itor.next() + " ");
        }


    }
}
