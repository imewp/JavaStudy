package com.imewp.demo01.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01HashMapSavePerson {
    /*
        HashMap存储自定义类型键值
        Map集合保证key是唯一的：
            作为key元素的值，必须重写hashCode()方法和 equals() 方法，以保证key唯一
    */
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("女王", 18), "英国");
        map.put(new Person("秦始皇", 18), "秦国");
        map.put(new Person("普京", 18), "俄罗斯");
        map.put(new Person("女王", 18), "毛利求斯");

//        Set<Person> person = map.keySet();
//        for (Person person1 : person) {
//            String s = map.get(person1);
//            System.out.println(person1 + "---->" + s);
//        }

        //使用entrySet和增强for遍历Map集合
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "----->" + value);
        }
    }

    private static void show01() {
        HashMap<String, Person> map = new HashMap<>();

        map.put("北京", new Person("张三", 18));
        map.put("上海", new Person("李四", 19));
        map.put("广州", new Person("王五", 20));
        map.put("北京", new Person("赵六", 21));

        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key + "---->" + value);
        }
    }
}
