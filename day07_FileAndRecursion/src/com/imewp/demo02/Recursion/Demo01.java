package com.imewp.demo02.Recursion;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(sum(100));
        System.out.println(jc(5));
    }

    public static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }

    public static int jc(int n) {
        if (n == 1) return 1;
        return n * jc(n - 1);
    }
}
