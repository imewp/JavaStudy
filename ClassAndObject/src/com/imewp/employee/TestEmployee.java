package com.imewp.employee;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] e = new Employee[3];
        for (int i = 0; i < 3; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            String position = sc.next();
            e[i] = new Employee(name, age, position);
            e[i].setSalary();
        }
        for (int i = 0; i < 3; i++) {
            e[i].toString();
        }
    }
}
