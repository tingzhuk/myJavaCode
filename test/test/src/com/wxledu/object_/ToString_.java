package com.wxledu.object_;


public class ToString_ {
    public static void main(String[] args) {
        Monster m1 = new Monster("小妖怪",44,'男');
        Monster m2 = new Monster("大大怪",14,'男');
        System.out.println(m1.toString());

        /*
        object 的 toString 方法
        getClass().getName()  全类名(包名+类名)
        Integer.toHexString(hashCode()) 16进制的hashCode码
         public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
         */

        System.out.println("==当直接输出对象时toString 方法会被默认调用==");
        System.out.println(m1);
    }
}

class Monster{
    private String name;
    private int age;
    private char gender;

    public Monster(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //重写object的 toString方法

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
