package com.wxledu.main_;

public class Main01 {
    //静态的变量/属性
    private static String name = "student";

    //非静态的属性/方法
    private int n1 = 10000;

    //静态方法
    public static void hi(){
        System.out.println("hi");
    }

    //非静态方法
    public void cry(){
        System.out.println("cry");
    }
    public static void main(String[] args) {
        //静态的main方法可以访问本类的静态成员
        System.out.println("name = " + name);
        hi();
        //静态的main方法不可访问本类的非静态成员（属性，方法）
//        System.out.println("ni = " + n1);错误

        //可以先创建一个类的实例访问非静态的成员
        Main01 main01 = new Main01();
        System.out.println("ni = " + main01.n1);
        main01.cry();
    }
}
