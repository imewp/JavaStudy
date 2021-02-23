package com.imewp.demo06.BigInteger;

import java.math.BigInteger;

public class BigIntergerExample3 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("1000000");
        BigInteger b = new BigInteger("2000000");
        BigInteger c = new BigInteger("-123");
        System.out.println(a.compareTo(b));
        BigInteger d;
        d = a.max(b);
        System.out.println(d == b);
        d = a.min(b);
        System.out.println(d == a);

        /*说明：System.out.println() 方法会自动调用参数引用对象的toString()方法，并将其转化成字符串*/
        System.out.println(c.abs());
        System.out.println(a.negate()); //更改正负数符号
        System.out.println(a.pow(2));
        System.out.println(a.gcd(b));
    }
}
