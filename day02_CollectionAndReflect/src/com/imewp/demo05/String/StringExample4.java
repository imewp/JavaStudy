package com.imewp.demo05.String;

public class StringExample4 {
    public static void main(String[] args) {
        String str="中国历史悠久文化灿烂，作为一个中国人，我永远感到自豪";
        int count=0,index=0,fromIndex=0;
        for(;;){
            index=str.indexOf("中国",fromIndex);
            if(index<0)
                break;
            count++;
            fromIndex=index+"中国".length();      //从这个“中国”之后开始下一次搜索

        }
        System.out.println("字符串中一共出现了"+count+"次\"中国\"");
    }
}
