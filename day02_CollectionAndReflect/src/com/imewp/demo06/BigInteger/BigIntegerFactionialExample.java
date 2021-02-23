package com.imewp.demo06.BigInteger;

import java.math.BigInteger;

public class BigIntegerFactionialExample {
    public static void main(String[] args) {
        System.out.println("用double型表示，30!=" + factorialDoubel(30));
        System.out.println("用BigInteger表示，30!=" + factionialBig(30));
    }

    public static BigInteger factionialBig(int n) {
        BigInteger result = BigInteger.ONE;   //表示1的BigInteger对象
        for (int i = 1; i <= n; i++) {
            BigInteger k = BigInteger.valueOf(i);
            result = result.multiply(k);
        }
        return result;

    }

    public static double factorialDoubel(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
