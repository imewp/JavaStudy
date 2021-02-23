package com.imewp.demo02.Set;

/*
    HashSet 存储自定义类型元素

    Set集合报错元素唯一：
        存储的元素（String，Integer，……Student，Person……）,必须重写hashCode()方法和equals()方法

        要求：
            同名同年龄的人，视为同一个人，只能存储一次
*/

import sun.java2d.pipe.SpanIterator;

import java.util.HashSet;

public class Demo01HashSetSavePerson {
    public static void main(String[] args) {
        //创建HashSet集合存储Person
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("小美女", 18);
        Person p2 = new Person("小美女", 18);
        Person p3 = new Person("小美女", 19);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
