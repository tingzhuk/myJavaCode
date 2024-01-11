package com.wxledu.innercass;

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();

        //外部其他类使用成员内部类的三种方式

        // 解读
        // 第一种方式
        // outer08.new Inner08()   相当与 把 new Inner08()  当做  outer08  的成员
        // 这就是一个语法，不用特别纠结
        Outer08.Inner08 inner08 = outer08.new Inner08();
        inner08.say();

        // 第二种方式，在外部类中，编写一个方法，返回 Inner08 的对象池
        Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
        inner08Instance.say();

        // 第三种方式
    }


}


class Outer08{//外部类
    private int n1 = 10;
    public String name = "张三";

    class Inner08{//成员内部类
        private int n2 = 99;
        private int n1 = 66;
        public void say(){
            //可以直接访问外部类的所有成员，包含私有的
            // 如果内部类的成员和外部类成员重名，则遵循就进原则
            System.out.println("Outer08 的 n1 = " + n1 + ",Outer08 的 name = " + name + "外部类 的 n1 = " + Outer08.this.n1);
        }
    }

    // 该方法返回一个  Inner08 实例
    public Inner08 getInner08Instance(){
        return new Inner08();
    }

    //写方法
    public void t1(){
        //使用成员内部类
        //创建成员内部类的对象，然后直接使用
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println(inner08.n2);
    }
}