package com.imewp.demo06.BigInteger;

public class PrimitivefacorialExample {
    //使用基本类型进行数值计算可能遇到精度损失和运算溢出问题
    public static void main(String[] args) {
        System.out.println("用int类型表示20!=" + factorialInt(20));
        System.out.println("用long类型表示20!=" + factorialLong(20));
        System.out.println("用float类型表示20!=" + factorialFloat(20));
        System.out.println("用double类型表示20!=" + factorialDouble(20));
        System.out.println("用long类型表示30!=" + factorialDouble(30));
        System.out.println("用double类型表示30!=" + factorialDouble(30));
    }


    public static int factorialInt(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static long factorialLong(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static float factorialFloat(int n) {
        float result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static double factorialDouble(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
