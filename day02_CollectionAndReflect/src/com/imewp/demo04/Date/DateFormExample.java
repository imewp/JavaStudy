package com.imewp.demo04.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormExample {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMMdd日HH时mm分");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yy年MM月dd日 EEE");
        SimpleDateFormat dateFormat3 = new SimpleDateFormat("yyyy年MM月dd日hh时mm分ss秒[a]");
        Date dateNow = new Date();
        System.out.println("现在的时间是：" + dateFormat1.format(dateNow));
        System.out.println("现在的时间是：" + dateFormat2.format(dateNow));
        System.out.println("现在的时间是：" + dateFormat3.format(dateNow));

    }
}
