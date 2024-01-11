package com.wxledu.homework;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.shout();
        Dog dog = new Dog();
        dog.shout();
    }
}

class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("狗会汪汪叫");
    }
}
class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("猫会喵喵叫");
    }
}

abstract class Animal{//抽象类
    public abstract void shout();
}
