package com.wxledu.main_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //类被加载的情况

        //1.创建对象实例
//        AA aa = new AA();

        //2.创建子类对象时父类会被加载,而且父类先被加载， 子类后被加载
        //BB bb = new BB();

        //3. 使用类的静态成员的时候（静态属性， 静态方法）
        //System.out.println(Cat.n1);

        //static 代码块实在类加载的时候执行的，只会执行执行一次

        //4. 普通代码块，在创建对象实例时，会被隐藏式的调用。
        // 被创建一次就会调用一次。
        // 如果只是使用静态成员的时，普通代码块并不会执行

        //DD dd = new DD();
        //DD dd1 = new DD();

        System.out.println(DD.n1);//888 静态代码块一定会执行
        //普通代码块只有在创建对象时候才会执行
    }
}

class DD{

    //DD的静态属性
    public static int n1 = 888;
    //静态代码块
    static {
        System.out.println("DD的静态代码块.....");
    }

    //普通代码块， new 对象时，被调用， 而且每创建一次对象，就调用一次
    //和类是否加载没关系
    //可以这样理解普通代码块是构造器的补充
    {
        System.out.println("DD的普通代码块");
    }
}

class Animal{
    //静态代码块
    static {
        System.out.println("Animal的静态代码块");
    }
}
class Cat extends Animal{

    public static int n1 = 99999;//静态属性

    //静态代码块
    static {
        System.out.println("Cat的静态代码块......");
    }
}

class AA{
    //静态代码块
    static {
        System.out.println("AA类的静态代码块1 被执行......");
    }
}

class BB extends AA{
    //静态代码块
    static {
        System.out.println("BB类的静态代码块1被执行.....");
    }
}
