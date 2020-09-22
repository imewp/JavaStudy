package com.imewp.demo01.Object;

import java.util.Objects;

public class Demo03Object3 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = null;
        String s3 = "abc";

        System.out.println(s1.equals(s3));
        //System.out.println(s2.equals(s3));
        System.out.println(Objects.equals(s2, s3));
    }
}
