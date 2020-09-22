package com.imewp.demo05.System;

import java.util.Arrays;

public class Demo01System {
    public static void main(String[] args) {
        demo02();
    }

    /*
        练习:
         将src数组中前3个元素，复制到dest数组的前3个位置上
         复制元素前:src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
         复制元素前:src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]
    */
    private static void demo02() {
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10};
        System.out.println("复制前：");
        System.out.println("数组src：" + Arrays.toString(src));
        System.out.println("数组dest：" + Arrays.toString(dest));

        System.arraycopy(src, 0, dest, 0, 3);

        System.out.println("复制后：");
        System.out.println("数组src：" + Arrays.toString(src));
        System.out.println("数组dest：" + Arrays.toString(dest));
    }

    //验证for循环打印数组1-9999所需要使用的时间（毫秒）
    private static void demo01() {
        long start = System.currentTimeMillis();

        for (int i = 1; i <= 9999; i++) {
            System.out.println(i);
        }

        long end = System.currentTimeMillis();
        System.out.println((end - start) + "毫秒");
    }
}
