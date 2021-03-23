package com.imewp.demo11.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    卖票案例 出现了线程安全问题
       卖出了不存在的票和重复的票

    解决线程安全问题的三种方案；使用Lock锁
       java.util.concurrent.locks.Lock接口
       Lock实现提供比使用synchronized方法和语句可以获得的更广泛的锁定操作。
       Lock接口中的方法：
           void lock()   获得锁。
           void unlock() 释放锁。
        java.util.concurrent.locks.ReentrantLock implements Lock接口

        使用步骤：
            1. 在成员位置创建一个ReentrantLock对象
            2. 在可能出现安全问题的代码前调用Lock接口中Lock   获取锁
            3. 在可能出现安全问题的代码前后调用Lock接口中unLock 释放锁

*/
public class RunnableImpl implements Runnable {
    //定义一个多个线程共享的票源
    private int ticket = 100;

    Lock l = new ReentrantLock();

    //设置线程任务：卖票
    @Override
    public void run() {
        //使用死循环，让卖票操作重复执行
        while (true) {

            l.lock();

            //判断票是否存在
            if (ticket > 0) {
                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                    //票存在，卖票 ticket--
                    System.out.println(Thread.currentThread().getName() + "--->正在卖票，第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    l.unlock(); //无论程序是否异常，都会把锁释放
                }
            }
        }
    }
}
