package com.imewp.demo01.Exception;

/*
    异常的产生过程解析（分析异常的怎么产生的，如何处理异常）
*/
public class Demo02Exception {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int e = getElement(arr, 3);
        System.out.println(e);
    }

    //定义一个方法，获取数组指定索引处的元素
    public static int getElement(int[] arr, int index) {
        int elem = arr[index];
        return elem;
    }
}
