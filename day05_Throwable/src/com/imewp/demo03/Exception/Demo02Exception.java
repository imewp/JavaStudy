package com.imewp.demo03.Exception;

//如果finally有return语句，永远返回finally中的结果，避免该情况
public class Demo02Exception {
    public static void main(String[] args) {
        System.out.println(getA());
    }

    public static int getA() {
        int a = 10;
        try {
            return a;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            //一定执行的代码
            a = 100;
            return a;
        }
    }
}
