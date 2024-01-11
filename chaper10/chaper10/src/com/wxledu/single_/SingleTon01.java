package com.wxledu.single_;

public class SingleTon01 {
    public static void main(String[] args) {
        //通过方法可以获取
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance.getName());
    }
}

//有一个类  GirlFriend
//只能有一个女朋友
class GirlFriend{
    private String name;

    //如何保证我们只创建一个对象

    //步骤[单例模式 -- 饿汉式]
    //1. 将构造器私有化
    private GirlFriend(String name) {
        this.name = name;
    }
    //2. 在类的内部创建对象(该对象是 static )
    //为了能够在静态方法中， 返回  gf  对象，要将其修饰为 static
    private static GirlFriend gf = new GirlFriend("小红");

    //3. 提供一个公共的static方法， 可以返回 gf 对象
    public static GirlFriend getInstance(){
        return gf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
