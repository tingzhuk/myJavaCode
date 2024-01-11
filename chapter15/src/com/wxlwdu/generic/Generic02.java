package com.wxlwdu.generic;

import java.util.ArrayList;

/**
 * @author 王鑫磊
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Generic02 {
    public static void main(String[] args) {
        // 使用泛型
        // 1. 当我们这样写 ArrayList<Dog>  表示存放到 ArrayList 中的对象时 Dog类型 （细节后面哈吼很多）
        // 2. 如果编译器发现添加的类型不满足要求就会报错
        // 3. 在遍历的时候可以直接取出 Dog 类型， 减少类型转换的次数 提高效率
        ArrayList<Dog> list = new ArrayList<Dog>();
        list.add(new Dog("旺财",16));
        list.add(new Dog("小财",1));
        list.add(new Dog("大财",6));

        // 假如我们程序员不小心加入了一只猫
//        list.add(new Cat("小猫", 8));

        System.out.println("====使用泛型====");
        for (Dog dog : list) {
            System.out.println(dog.getName() + dog.getAge());
        }

    }
}
