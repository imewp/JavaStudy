package com.imewp.demo02.Date;

import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) {
        //获取当前系统时间到 1970年1月1日00:00:00 经历的多少毫秒
        System.out.println(System.currentTimeMillis());
        System.out.println(new Date().getTime());

        //获得当前系统的时间
        System.out.println(new Date());

        //把毫秒转换成 Date日期
        System.out.println(new Date(13124094905L));


    }
}
