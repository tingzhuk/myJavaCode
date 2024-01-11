package com.wxledu.single_;

/**
 * 演示懒汉式的  单例模式
 */
public class SingleTon02 {
    public static void main(String[] args) {
        System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();
        System.out.println(instance);

        //再次调用 getInstance()
        Cat instance1 = Cat.getInstance();
        System.out.println(instance1);

        System.out.println(instance == instance1);
    }
}

//希望在程序运行过程中只能创建一个 Cat 对象
//使用单例模式
class Cat{
    private String name;
    public static int n1 = 888;
    private static Cat cat;

    //步骤
    //1. 仍然构造器私有化
    //2. 定义一个 static 属性对象
    //3. 提供一个 public 的 static 方法，可以返回一个 cat 对象
    //4. 只有当用户使用方法 getInstance() 的时候才返回 cat 对象，从而保证了单一
    public Cat(String name) {
        System.out.println("构造器被调用....");
        this.name = name;
    }
    public static Cat getInstance(){
        if (cat == null){//如果还没创建对象
            cat = new Cat("小可爱");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
