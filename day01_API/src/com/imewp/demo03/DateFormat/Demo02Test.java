package com.imewp.demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo02Test {
    /* 请使用日期时间相关的api，计算出一个人出生了多少天 */
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String bir = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        long birDate = sdf.parse(bir).getTime();

        long NowDate = new Date().getTime();
        System.out.println((NowDate - birDate) / 1000 / 3600 / 24);
    }
}
