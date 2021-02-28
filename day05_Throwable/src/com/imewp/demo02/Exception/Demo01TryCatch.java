package com.imewp.demo02.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    try...catch 异常处理的第二种方法，自己处理异常
    格式：
        try{
            可能产生异常的代码
        }catch(定义一个异常的变量，用来接收try中抛出的异常对象){
            异常的处理逻辑，异常对象之后，怎么处理异常对象
            一般在工作中，会把异常的信息记录到一个日志中
        }
        ....
        catch(异常类名 变量名){

        }
    注意：
        1. try中可能抛出多个异常对象，那么就可以是哦也能够多个catch来处理这些异常对象
        2. 如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完毕catch中的处理逻辑，继续执行try...catch之后的代码
           如果try中没有产生异常，那么就不会执行catch中的异常处理逻辑，执行完try中的代码，继续执行try...catch之后的代码
*/
public class Demo01TryCatch {
    public static void main(String[] args) {
        try {
            readFile("c:\\a.php");
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println(e);
        }
        System.out.println("后续代码");
    }

    public static void readFile(String fileName) throws IOException {
        if (!fileName.equals("c:\\a.txt"))
            throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");
        if(!fileName.endsWith(".txt"))
            throw  new IOException("文件的后缀名不对");
        System.out.println("路径没有问题，读取文件");
    }
}
