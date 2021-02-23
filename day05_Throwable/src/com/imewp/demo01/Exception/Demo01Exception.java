package com.imewp.demo01.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.lang.Throwable：类是 Java语言中所有错误或异常的超类。
    Exception：编译期异常，进行编译 java程序出现的问题
        RuntimeException：进行期异常，Java称程序运行过程中出现的问题
        异常就是相当于程序中得了一个小毛病，把异常处理掉，程序可以继续执行
    Error：错误
        错误就相当于程序得了一个无法治愈的毛病，必须修改源代码，程序才能继续执行
*/
public class Demo01Exception {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  //用来格式化日期
        Date data = null;
        try {
            data = sdf.parse("1999-09-09"); //把字符串格式的日期，解析为Data格式的日期
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(data);

    }
}
