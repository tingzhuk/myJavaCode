package com.wxledu.main_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();// (1) getN1被调用...  (2) A的静态代码块.....
    }
}

class A{

    private int n2 = getN2();//普通属性初始化

    {//普通代码块
        System.out.println("A的普通代码块");
    }

    //静态属性初始化
    private static int n1 = getN1();

    static {//静态代码块
        System.out.println("A的静态代码块.....");
    }

    public static int getN1(){
        System.out.println("getN1被调用...");
        return 100;
    }

    public int getN2(){
        System.out.println("getN2被调用....");
        return 10;
    }

    //无参构造器
    public A(){
        System.out.println("A的无参构造器被调用.....");
    }
}
