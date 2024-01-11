package com.wxledu.homework;

import java.util.ArrayList;

/**
 * @author 王鑫磊
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car c1 = new Car("奥迪", 9999);
        Car c2 = new Car("宝马", 777777);
        Car c3 = new Car("沃尔沃", 66666);
        Car c4 = new Car("888", 66666);
        arrayList.add(c1);
        arrayList.add(c2);
        arrayList.add(c3);
        // remove 删除指定元素
        arrayList.remove(c1);
        // contains 查找元素是否存在
        arrayList.contains(c1);
        // size 获取元素个数
        System.out.println(arrayList.size());
        // isEmpty 判断是否为空
        System.out.println(arrayList.isEmpty());
        // clear  清空list
//        arrayList.clear();
        // addAll 添加多个元素
        arrayList.addAll(arrayList);
        System.out.println(arrayList);
        // removeAll 删除多个元素
//        arrayList.removeAll(arrayList);
        // 本质相当于清空

        // 增强 for 循环遍历所有的 car 需要重写 car  的 toString 方法
        for (Object o : arrayList) {
            System.out.println(o);
        }


    }
}

class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
