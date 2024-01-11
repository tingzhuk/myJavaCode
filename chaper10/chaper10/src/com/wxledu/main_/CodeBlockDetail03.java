package com.wxledu.main_;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();
    }
}

class AAA{
    {
        System.out.println("AAA的普通代码块....");
    }
    public AAA(){
        //隐藏了
        //super();
        //调用本类的普通代码块
        System.out.println("AAA()  构造器被调用了....");
    }
}

class BBB extends AAA{
    {
        System.out.println("BBB的普通代码块....");
    }
    public BBB(){
        //隐藏了
        //super();
        //调用本类的普通代码块
        System.out.println("BBB()  构造器被调用了....");
    }
}
