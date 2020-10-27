package com.imewp.demo06.StringBuilder;

public class Demo01StringBuilder {

    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1：" + bu1);

        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2：" + bu2);

        //使用append方法无需接受返回值
        bu2.append("cdf");
        bu2.append(123);
        bu2.append(true);
        bu2.append(3.1415927);
        bu2.append('中');
        System.out.println("bu2：" + bu2);

        //链式编程：方法的返回值是一个对象，可以根据对象继续调用方法
        bu1.append("abc").append(123).append(3.134);
        System.out.println(bu1);

        //reverse 反转内容
        bu1.reverse();
        System.out.println(bu1);
    }
}
