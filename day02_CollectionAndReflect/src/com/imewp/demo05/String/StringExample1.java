package com.imewp.demo05.String;

public class StringExample1 {
    public static void main(String[] args) {
        String path = "C:\\test\\java\\Hello.java";
        int count = 0;
        System.out.println("要处理的字符串：" + path + "，字符串长度是：" + path.length());

        //先将字符串内容转换为字符数组，然后搜索这个数组获得'\'字符的位置信息
        char[] arr = path.toCharArray();      //创建与path字符串内容相同的字符数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '\\') {       //检查字符数组的第i个字符是否是字符'\'
                count++;
                System.out.println("字符串中第" + count + "个\\字符的位置是" + i);
            }
        }

        //直接通过charAt方法获取字符信息，效果上与上述方式相同
        System.out.println("直接从字符串中获取字符信息");
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == '\\') {    //检查字符数组的第i个字符是否是字符'\'
                count++;
                System.out.println("字符串中第" + count + "个\\字符的位置是" + i);
            }
        }
    }
}
