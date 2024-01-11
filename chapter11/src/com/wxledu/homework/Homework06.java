package com.wxledu.homework;

import com.sun.corba.se.impl.orbutil.HexOutputStream;
import com.sun.org.apache.xpath.internal.objects.XString;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Homework06 {
    public static void main(String[] args) {
        Person jack = new Person("jack", new Horse());
        jack.common();
        jack.passRiver();
    }
}

class VehiclesFactory{
    // 交通工具工厂类
    public static Horse horse = new Horse(); //饿汉式
    public static Boat getBoat(){
        return new Boat();
    }
}
class Person{
    private String name;
    public Vehicles vehicles;

    //在创建人对象时，事先给他分配一个交通工具
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    //实例化 Person 对象，一般情况下用马儿作为交通工具，遇到大河时用船
    //这里涉及到一个编程思想，就是可以把具体的要走封装方法
    // 如何不浪费在构建对象时传入的交通工具
    public void passRiver(){
        //先得到船
        if(!(vehicles instanceof Boat)){
            vehicles = VehiclesFactory.getBoat();
        }
//        Boat boat = VehiclesFactory.getBoat();
        vehicles.work();
    }
    public void common(){
        // 判断一下当前的  vehicles 属性是否已经存在
        if(!(vehicles instanceof Horse)){
            vehicles = VehiclesFactory.horse;
        }

        vehicles.work();
    }
}

class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("坐船");
    }
}

class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("马儿");
    }
}
interface Vehicles{
    void work();
}
