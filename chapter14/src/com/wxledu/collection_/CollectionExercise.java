package com.wxledu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class CollectionExercise {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Dog("jack", 20));
        col.add(new Dog("tom", 19));
        col.add(new Dog("smith", 21));

        // 迭代器遍历
        Iterator iterator = col.iterator();
        System.out.println("=====迭代器遍历=======");
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
        //重置迭代器
        iterator = col.iterator();
        System.out.println("====增强 for 循环遍历=====");
        for (Object o :col) {
            System.out.println(o);
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
