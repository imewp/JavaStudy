package com.imewp.demo04.setName;

public class Demo01SetThreadName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("旺财");
        mt.start();

        new MyThread("小强").start();
    }
}
