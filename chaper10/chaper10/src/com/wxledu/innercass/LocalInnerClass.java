package com.wxledu.innercass;

/**
 * 演示局部内部类的使用
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        //演示一下
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}

class Outer02{//外部类
    private int n1 = 100;

    private void m2(){}//私有方法
    public void m1(){//方法
        // 1. 局部内部类是定义在外部类的局部位置，通常在 方法
        // 2. 不能添加访问修饰符，但是可以使用 final 修饰，因为局部变量可以使用 final 修饰
        // 3. 作用域 ： 仅仅在定义它的方法 和 代码块中
        class Inner02{//局部内部类(本质还是一个类)
            // 4. 可以直接访问外部类的所有成员，包含私有的
            public void f1(){
                // 5. 局部内部类直接访问外部类的成员。 比如下面  n1  m2()
                System.out.println("n1 = " + n1);
                m2();
            }
        }
        // 6. 外部类可以在这个方法中创建 Inner02 对象，然后调用方法即可
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}
