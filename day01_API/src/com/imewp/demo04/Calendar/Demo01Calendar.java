package com.imewp.demo04.Calendar;

import java.time.Year;
import java.util.Calendar;

public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
//        System.out.println(c);

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONDAY) + 1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DATE));
        System.out.println();
        c.set(1999, 04, 03);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONDAY) + 1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));


        System.out.println(c.getTime());
    }
}
