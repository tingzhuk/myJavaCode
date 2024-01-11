package com.wxledu.innercass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}

class Outer05{
    private int n1 = 99;
    public void f1(){
        //创建一个基于类的匿名内部类
        // 不能添加访问修饰符，因为他本身的地位就是一个局部变量
        // 作用域： 仅仅在定义的方法或者代码块中  Outer05$1
        // 匿名内部类访问外部类的成员直接访问
        Person person = new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了 hi() 方法 n1 = " + n1);
            }
        };
        person.hi();//动态绑定， 运行类型是 Outer05$1

        //也可以直接调用，匿名内部类的本质是返回一个对象
        // class 匿名内部类 extends Person {}
        new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了 hi()哈哈哈 方法");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("jack");
    }
}
class Person{//类
    public void hi(){
        System.out.println("Person hi()....");
    }
    public void ok(String str){
        System.out.println(str);
    }
}

// 抽象类 / 接口