package com.imewp.demo01.Object;

import java.util.Random;
import java.util.Scanner;

public class Demo01ToString {
    public static void main(String[] args) {
        Person p = new Person("张三", 20);
        String s = p.toString();
        System.out.println(s);

        System.out.println(p);


        Random r = new Random();
        System.out.println(r);

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
    }

}
