package com.wxledu.innercass;

public class StaticInnerClass {
    public static void main(String[] args) {

        Outer10 outer10 = new Outer10();
        outer10.show();


        //外部其他类----->  访问  ----->  内部静态类

        //方式一
        //因为静态内部类，是可以通过类名直接访问的，（前提是满足访问条件）
        Outer10.Inner02 inner02 = new Outer10.Inner02();
        inner02.say();
        //方式二
        //编写一个方法，可以返回静态类对象
        Outer10.Inner02 inner021 = outer10.getInner02();
        System.out.println("========");
        inner021.say();

        Outer10.Inner02 inner022 = Outer10.getInner02_();
        System.out.println("******");
        inner022.say();
    }
}

class Outer10{//外部类
    private int n1 = 10;
    private static String name = "张三";
    static class Inner02{//静态内部类
        public void say(){
            System.out.println(name);
            // 不能访问外部类的非静态成员
            //System.out.println(n1);
        }
    }

    public void show(){
        // 外部类使用内部类
        new Inner02().say();
    }

    public Inner02 getInner02(){
        return new Inner02();
    }

    public static Inner02 getInner02_(){
        return new Inner02();
    }
}
