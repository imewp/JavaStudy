package com.imewp.demo07.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<Person> alt = new ArrayList<>();
        Person p1 = new Person("张三", 19);
        Person p2 = new Person("李四", 15);
        Person p3 = new Person("王五", 30);
        Person p4 = new Person("张三", 15);
        alt.add(p1);
        alt.add(p2);
        alt.add(p3);
        alt.add(p4);

        Collections.sort(alt, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.getAge() - o2.getAge();
                if (result == 0) {
                    result = o2.getName().compareTo(o1.getName());
                }
                return result;
            }
        });

        System.out.println(alt);

    }
}
