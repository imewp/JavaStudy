package com.imewp.demo04.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample2 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒 EEE");
        Date dateNow = new Date();
        System.out.println(dateFormat.format(dateNow));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateNow);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("年份 = " + year + "，月份 = " + month + "，日 = " + day);
        System.out.println("小时 = " + hour + "，分 = " + minute + "，秒 = " + second);
        System.out.println("星期 = " + dayOfWeek);
    }

}
