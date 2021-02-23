package com.imewp.demo06.BigInteger;

import java.math.BigInteger;

public class BigIntegerExample1 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("100");
        BigInteger b = new BigInteger("9");
        BigInteger c = new BigInteger("-100");
        BigInteger result1 = a.add(b);
        System.out.println("100+9=" + result1.toString());
        BigInteger result2 = a.subtract(b);
        System.out.println("100-9=" + result2.toString());
        BigInteger result3 = a.multiply(b);
        System.out.println("100*9=" + result3.toString());
        BigInteger result4 = a.divide(b);
        System.out.println("100/9=" + result4.toString());
        BigInteger result5 = a.remainder(b);
        System.out.println("100%9=" + result5.toString());
        BigInteger result6 = a.mod(b);
        System.out.println("100 mod 9=" + result6.toString());
        BigInteger result7 = c.remainder(b);
        System.out.println("-100%9=" + result7.toString());
        BigInteger result8 = c.mod(b);
        System.out.println("-100 mod 9=" + result8.toString());
    }
}
