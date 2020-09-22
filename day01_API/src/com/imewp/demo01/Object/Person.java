package com.imewp.demo01.Object;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
        object类的equals方法默认比较的是两个对象的地址值，没有意义
        所有我们需要重写equals方法，比较两个对象的属性值（name，age）
    */
//    @Override
//    public boolean equals(Object obj) {
//        //如果传递的参数为null，直接返回flase，提高程序的效率
//        if (obj == null)
//            return false;
//
//        //如果传递的参数obj是this本身，直接返回true，提高程序效率
//        if (obj == this)
//            return true;
//
//        //增加一个判断，是Person类型的转换，防止类型转换异常ClassCastException
//        if (obj instanceof Person) {
//            //使用向下转型（强转）把object类型转成person
//            Person pr = (Person) obj;
//            if (this.name.equals(pr.name) && this.age == pr.age)
//                return true;
//            else
//                return false;
//        }
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
