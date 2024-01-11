package com.wxledu.interface_;

public class ExtendsVsImplements {
    public static void main(String[] args) {
        LittleMonkey littleMonkey = new LittleMonkey("悟空");
        littleMonkey.climbing();
        littleMonkey.swimming();
        littleMonkey.flying();
    }
}

class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing(){
        System.out.println(name + "会爬树");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//接口
interface Fishable{
    void swimming();
}

interface Bridable{
    void flying();
}


//继承小结：  当子类继承了父类，子类就自动拥有的父类的功能
//           如果子类需要拓展功能，则需要实现接口的方式扩展
//           可以理解  实现接口是对 java 单继承机制的一种补充
class LittleMonkey extends Monkey implements Fishable,Bridable{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + "通过学习可以像鱼儿一样有用");
    }

    @Override
    public void flying() {
        System.out.println(getName() + "通过学习可以像鸟儿一样飞翔");
    }
}
