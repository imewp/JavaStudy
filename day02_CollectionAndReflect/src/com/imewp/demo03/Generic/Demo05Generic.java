package com.imewp.demo03.Generic;

import java.util.ArrayList;

public class Demo05Generic {
    /*
    *   泛型的通配符：
    *       ?：代表任意的数据类型
    *   使用方法：
    *       不能创建对象使用
    *       只能作为方法的参数使用
    * */
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);
        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        print(list01);
        print(list02);


    }
    public static void print(ArrayList<?> arr){
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
