package com.imewp.demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
       // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        System.out.println(date);
        System.out.println(sdf.format(date));

        System.out.println(sdf.parse("2020年09月22日 22时03分15秒"));
    }
}
