package com.wxledu.homework;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Homework07 {
    public static void main(String[] args) {
        Car car = new Car(55);
        car.getAir().flow();
        Car car1 = new Car(-1);
        car1.getAir().flow();
    }
}

class Car{
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if(temperature > 40){
                System.out.println("吹冷气");
            }else if (temperature < 0){
                System.out.println("吹暖气");
            }else {
                System.out.println("不吹风");
            }
        }
    }

    //返回 Air 对象
    public Air getAir(){
        return new Air();
    }
}
