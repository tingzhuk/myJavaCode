package com.wxledu.set_;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author 王鑫磊
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();

        linkedHashSet.add(new Car("奔驰",233));
        linkedHashSet.add(new Car("宝马",555));
        linkedHashSet.add(new Car("奔驰",233));

        System.out.println("linkedHashSet = " + linkedHashSet);
    }
}

/**
 *  Car 类 （属性 name  price） ， 如果 name 和 price 一样 则认为是相同的元素，就不能添加
 */

class Car{
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
