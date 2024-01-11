package com.wxledu.innercass;

/**
 * 演示匿名内部类的使用
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}


class Outer04{
    private int n1 = 10; //属性

    public void method(){//方法
        //基于接口的匿名内部类
        // 1. 需求：想使用接口 IA， 并创建对象
        // 2. 传统方式：是写一个类，实现该接口，并创建对象
        // 3. 希望 tiger 这个类值使用一次，以后再也不使用了
        // 4. 可以使用匿名内部类简化开发
        // 5. tiger 的编译类型：IA （看等号左边）
        // 6. tiger 的运行类型：就是匿名内部类 XXX => Outer04$1

        /*
                我们看底层
                class XXXX implements IA{
                    @Override
                    public void cry() {
                        System.out.println("老虎叫唤......");
                    }
                }
         */

        // 7. jdk 底层，在创建了匿名内部类 Outer04$1 ,立即马上创建了 Outer04$1 实例， 并且把地址返回给 tiger

        IA tiger = new IA(){
            @Override
            public void cry() {
                System.out.println("老虎叫唤.....");
            }
        };
        System.out.println("tiger的运行类型 = " + tiger.getClass());
        tiger.cry();
        tiger.cry();

        // 演示基于类的匿名内部类
        // 分析
        // 1.  编译类型是 father
        // 2.  运行类型是  Outer04$2
        // 3.  底层会会创建一个匿名内部类
        /*
                class Outer04$2 extends father{}
         */
        // 4. 同事也直接返回了 匿名内部类 Outer04$2 这个对象
        // 5. 注意 ： 参数列表会传递给 构造器
        father jack = new father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写了 test() 方法");
            }
        };
        System.out.println("father对象的运行类型 = " + jack.getClass());
        jack.test();

        //基于抽象类的匿名内部类
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("实现了 抽象类的 eat() 方法");
            }
        };
        animal.eat();
    }
}

interface IA{
    public void cry();
}

class father{//类

    public father(String name) {//构造器
        System.out.println("接受到" + name);
    }

    public void test(){}
}

abstract class Animal{
    abstract void eat();
}