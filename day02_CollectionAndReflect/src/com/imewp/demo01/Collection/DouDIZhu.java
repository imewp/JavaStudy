package com.imewp.demo01.Collection;

import java.util.ArrayList;
import java.util.Collections;

/*
    斗地主综合案例：
    1. 准备牌
    2. 洗牌
    3. 发牌
    4. 看牌
*/
public class DouDIZhu {
    public static void main(String[] args) {
        //定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个数组存储牌的花色，一个数组存储牌的序号
        String[] colors = {"♥", "♠", "♦", "♣"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        //先把大王和小王存储到poker集合中
        poker.add("大王");
        poker.add("小王");

        //循环嵌套遍历两个数组 组装52张牌
        for (String number : numbers) {
            for (String color : colors) {
                poker.add(color + number);
            }
        }
        /*
            使用集合的工具类Collections中的方法
            static void shuffle(List<?> list) 使用默认随机源对指定列表进行置换
        */
        Collections.shuffle(poker);
        System.out.println(poker);

        //定义4个集合，存储玩家的牌和底牌
        ArrayList<String> ployer01 = new ArrayList<>();
        ArrayList<String> ployer02 = new ArrayList<>();
        ArrayList<String> ployer03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);

            if (i >= 51) {
                diPai.add(p);
            } else if (i % 3 == 0) {
                ployer01.add(p);
            } else if (i % 3 == 1) {
                ployer02.add(p);
            } else if (i % 3 == 2) {
                ployer03.add(p);
            }
        }

        System.out.println("1号：" + ployer01);
        System.out.println("2号：" + ployer02);
        System.out.println("3号：" + ployer03);
        System.out.println("底牌：" + diPai);
    }

}






















