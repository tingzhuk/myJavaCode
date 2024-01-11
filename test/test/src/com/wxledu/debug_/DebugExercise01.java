package com.wxledu.debug_;

public class DebugExercise01 {
    public static void main(String[] args) {
        Person jack = new Person("jack", 18, 20000);
        System.out.println(jack);
    }
}
class Person{
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
