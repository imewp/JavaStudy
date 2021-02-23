package com.imewp.employee;

public class Employee {
    private String name;
    private int age;
    private String position;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        try {
            if (age >= 18)
                this.age = age;
            else
                this.age = 18;
        } catch (Exception e) {
            this.age = 18;
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position == "售后服务" || position == "销售员")
            this.position = position;
        else
            this.position = "售后服务";
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary() {
        if (age >= 18 && age <= 20)
            this.salary = 1000;
        else if (age >= 21 && age <= 25)
            this.salary = 1500;
        else if (age >= 26 && age <= 30)
            this.salary = 2000;
        else if (age >= 31 && age <= 40)
            this.salary = 3000;
        else if (age >= 41 && age <= 50)
            this.salary = 3500;
        else if (age >= 50)
            this.salary = 4000;
    }

    public Employee() {
    }

    public Employee(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public Employee(String name, int age, String position, double salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
