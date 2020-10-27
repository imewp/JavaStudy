package com.imewp.demo07.Integer;

public class Demo01Integer {

    /*
        装箱：把基本类型的数据，包装到包装类中（基本类型的数据 -> 包装类）

        拆箱：在包装类中取出基本类型的数据（包装类 -> 基本类型的数据）
    */
    public static void main(String[] args) {
        //装箱
        Integer i1 = new Integer(1);
        System.out.println(i1);
        Integer i2 = new Integer("1");
        System.out.println(i2);

        Integer i3 = Integer.valueOf(1);
        System.out.println(i3);
        Integer i4 = Integer.valueOf("1");
        System.out.println(i4);

        //拆箱
        int i = i1.intValue();
        System.out.println(i);
    }
}
