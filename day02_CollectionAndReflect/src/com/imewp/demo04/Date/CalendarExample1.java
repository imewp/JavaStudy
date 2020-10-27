package com.imewp.demo04.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample1 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date dateNow = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 0, 1);
        Date date2021 = calendar.getTime();
        long countDay = (date2021.getTime() - dateNow.getTime()) / (24 * 60 * 60 * 1000);
        System.out.println("现在的时间是：" + dateFormat.format(dateNow));
        System.out.println("距离2021年元旦还有" + countDay + "天");
        int countSunday = 0;
        for (int i = 2010; i <= 2020; i++) {
            calendar.set(i, 0, 1);
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                countSunday++;
                Date date = calendar.getTime();
                System.out.println(dateFormat.format(date) + "是周日");
            }
        }
        System.out.println("共有" + countSunday + "天是周日");

    }
}
