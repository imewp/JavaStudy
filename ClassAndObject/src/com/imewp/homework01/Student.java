package com.imewp.homework01;

public class Student {
    private String name;
    private int age;
    static int num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void study() {
        System.out.println(name + "正在学习");
    }

    public void qiandao() {
        if (age <= 22)
            num++;
    }

    public void printNum() {
        System.out.println("现在一共有" + num + "个学生已经签到，" + num + "为计数");
    }
}
