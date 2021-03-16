package com.imewp.demo05.sleep;

import javax.swing.plaf.SliderUI;

//static void sleep(long millis)
//  使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行），具体取决于系统定时器和调度程序的精度和准确性。
public class Demo01Sleep {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);

            //使用Thread类中的sleep方法让程序睡眠1秒钟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
