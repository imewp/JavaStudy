package com.imewp.demo01.Object;

public class Demo02Equals {
    public static void main(String[] args) {
        Person p1 = new Person("张三", 19);
        Person p2 = new Person("李四", 19);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.equals(p2));
    }
}
