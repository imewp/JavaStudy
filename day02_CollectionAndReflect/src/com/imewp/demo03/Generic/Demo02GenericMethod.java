package com.imewp.demo03.Generic;

public class Demo02GenericMethod {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();

        gm.method01(10);
        gm.method01("abc");
        gm.method01(8.8);
        gm.method01(true);

        GenericMethod.method02(100);
        GenericMethod.method02("cde");

    }
}
