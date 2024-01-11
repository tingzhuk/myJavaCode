package com.wxledu.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class HashSetExercise {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();

        hashSet.add(new Employee("jack", 22));
        hashSet.add(new Employee("tom", 23));
        hashSet.add(new Employee("jack", 22));

        // 回答 加入了几个？
        System.out.println("hashSet = " + hashSet);

    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 如果 name 和 age  值相同 则返回相同的hash 值

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
