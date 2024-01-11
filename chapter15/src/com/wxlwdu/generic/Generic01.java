package com.wxlwdu.generic;

import java.util.ArrayList;

/**
 * @author 王鑫磊
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Generic01 {
    public static void main(String[] args) {
        //使用传统的方法来解决
        ArrayList list = new ArrayList();
        list.add(new Dog("旺财",16));
        list.add(new Dog("小财",1));
        list.add(new Dog("大财",6));

        // 假如我们程序员不小心加入了一只猫
        list.add(new Cat("小猫", 8));


        //遍历
        // 增强 for 循环
        for (Object o : list) {
            //向下转型
            Dog d = (Dog) o;
            System.out.println(d.getName() + d.getAge());
        }

    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
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
}

class Cat{
    private String name;
    private int age;

    public Cat(String name, int age) {
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
}
