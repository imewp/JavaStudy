package com.imewp.homework01;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("1", 17);
        Student s2 = new Student("2", 18);
        Student s3 = new Student("3", 19);
        Student s4 = new Student("4", 20);
        Student s5 = new Student("5", 21);
        Student s6 = new Student("6", 22);
        Student s7 = new Student("7", 23);
        Student.num = 0;
        s1.qiandao();
        s2.qiandao();
        s3.qiandao();
        s3.study();
        s4.study();
        s5.study();
        s6.study();
        s7.study();
        s1.printNum();
    }
}
