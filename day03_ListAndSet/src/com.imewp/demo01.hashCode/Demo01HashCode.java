package com.imewp.demo01.hashCode;

/*
    哈希值：是一个十进制的整数，由系统随机给出（就是对象的地址值，是一个逻辑地址，是模拟出来得到地址，不是数据实际存储的物理地址）
    在Object类有一个方法，可以获取对象的哈希值
    int hashCode()  返回该对象的哈希码值
*/

public class Demo01HashCode {
    public static void main(String[] args) {
        Person p1 = new Person();
        int v1 = p1.hashCode();
        System.out.println(v1);

        Person p2 = new Person();
        int v2 = p2.hashCode();
        System.out.println(v2);

    }
}
