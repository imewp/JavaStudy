package com.imewp.demo01.Map;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo02Hashtable {
    /*
        java.util.HasHtable<K,V>集合 implements Map<K,V> 接口
        Hashtable:底层也是一个哈希表，是一个线性安全的集合，是单线程集合，速度慢
        HashMap:底层是一个哈希表，是一个线程不安全的集合，是多线程的集合，速度快

        Hashtable的子类Properties 依然活跃在历史舞台
        Perperties集合是一个唯一的和IO相结合的集合
     */
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);
        Hashtable<String, String> table = new Hashtable<>();
        //table.put(null,null);


    }
}
