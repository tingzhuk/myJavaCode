package com.wxledu.encap;

import java.util.Scanner;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("请输入姓名");
        Scanner sc =new Scanner(System.in);
        person.setName(sc.next());
        System.out.println("请输入年龄");
        person.setAge(sc.nextInt());
        System.out.println("请输入工资");
        person.setSalary(sc.nextDouble());

        System.out.println(person.info());


    }
}

class Person{
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6){
            this.name = name;
        } else {
            System.out.println("名字长度非法");
            this.age = 18;//给一个默认值
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120){
            this.age = age;
        } else {
            System.out.println("输入的年龄非法");
            this.name = "无名人";//给一个默认值
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info(){
        return "姓名：" + name + "年龄：" + age + "工资：" + salary;
    }
}
