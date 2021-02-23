package com.imewp.demo01.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    throws关键字：异常处理的第一种方法，交个别人处理
    作用：
        当方法内部抛出异常对象的时候，我们就必须处理这个异常对象
        可以使用throws关键字处理异常对象，会把异常对象声明抛出给方法的调用者处理（自己不处理，给别人处理），最终交给JVM处理--->中断处理
    注意：
        1. throws关键字必须写在方法声明处
        2. throws关键字后边声明的异常必须是Exception或者是Exception的子类
        3. 方法内部如果抛出了多个异常对象，那么throws后边也声明多个异常
            如果抛出的多个异常对象有子父类关系，那么直接声明父类异常即可
        4. 调用了一个声明抛出异常的方法，我们就必须的处理声明的异常
            要么使用throws声明抛出，交给方法的调用者处理，最终交给JVM
            要么try..catch自己处理异常
*/
public class Demo04throws {
    public static void main(String[] args) throws IOException {
        readFile("d:\\a.txt");
    }

    /*
        定义一个方法，对传递的文件路径进行合理化判断
        如果路径不是”c:\a.txt“，那么我们就抛出文件找不到异常对象，告知方法的调用者
        注意：
            FileNotFoundException是编译异常，抛出了编译异常，就必须处理这个异常
            可以使用throws继续声明抛出FileNotFoundException这个异常对象，让方法的调用者处理
    */
    public static void readFile(String fileName) throws IOException {
        if (!fileName.equals("c:\\a.txt"))
            throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");
        //如果传递的路径，不是.txt结尾
        //那么我们就抛出IO异常对象，告知方法的调用者，文件的后缀名不对
        if(!fileName.endsWith(".txt"))
            throw  new IOException("文件的后缀名不对");
        System.out.println("路径没有问题，读取文件");
    }
}
