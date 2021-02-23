package com.imewp.demo01.Map;

import java.util.HashMap;
import java.util.Scanner;

//计算一个字符串中字符的个数
public class Demo03MapTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                Integer value = map.get(c);
                value++;
                map.put(c, value);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }
}
