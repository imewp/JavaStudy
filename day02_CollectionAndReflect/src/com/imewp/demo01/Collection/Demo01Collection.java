package com.imewp.demo01.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        coll.add("张三");
        coll.add("李四");
        coll.add("赵六");
        coll.add("田七");

        System.out.println(coll);

        coll.remove("张三");
        System.out.println(coll);

        System.out.println(coll.contains("李四"));

        Object[] obj = coll.toArray();
        for (int i = 0; i <coll.size() ; i++) {
            System.out.print(obj[i]+" ");
        }
    }
}
