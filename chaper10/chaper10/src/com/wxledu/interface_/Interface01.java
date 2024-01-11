package com.wxledu.interface_;

public class Interface01 {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Phone phone = new Phone();

        Computer computer = new Computer();
        computer.work(phone);//把手机接入到计算机

        System.out.println("===============");
        computer.work(camera);
    }
}
