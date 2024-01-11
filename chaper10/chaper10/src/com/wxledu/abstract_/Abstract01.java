package com.wxledu.abstract_;

public class Abstract01 {
    public static void main(String[] args) {

    }
}


abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //思考：这里 eat 这里你实现了，其实没有什么意义
    //即：父类的不确定性问题
    //=====>  考虑将该方法设计成抽象方法
    //=====>  所谓抽象方法就是没有实现的方法
    //=====>  所谓没有实现就是没有方法体
    //=====>  当一个类中存在抽象方法是，需要把该类声明为 abstract
    //=====>  一般来说，抽象类会被继承，有其来实现抽象类的方法
    public abstract void eat();
}