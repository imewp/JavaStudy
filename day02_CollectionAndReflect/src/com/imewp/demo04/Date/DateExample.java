package com.imewp.demo04.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date dateNow = new Date();
        System.out.println("现在的时间是：" + dateNow.toString());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        long timeNumber = dateNow.getTime();        //得到dateNow对象的时间毫秒值
        Date[] date = new Date[3];
        for (int i = 0; i < date.length; i++) {
            long count = (long) (Math.random() * 1000 - 500);
            long period = count * 24 * 60 * 60 * 1000;
            date[i] = new Date(timeNumber + period);
        }
        System.out.println("随机产生的时间为：");
        for (int i = 0; i < date.length; i++) {
            System.out.println("第" + i + "个时间是：" + dateFormat.format(date[i]));
            if (date[i].before(dateNow)) {
                System.out.println("，比当前时间早");
            } else if (date[i].after(dateNow)) {
                System.out.println("，比当前时间迟");
            } else {
                System.out.println("，就是当前时间");
            }
        }
    }
}
