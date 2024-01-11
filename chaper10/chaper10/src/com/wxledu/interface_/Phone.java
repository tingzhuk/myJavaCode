package com.wxledu.interface_;

//Phone 类实现了 UsbInterface
//解读: 1. Phone 类实现UsbInterface 接口   规定/声明方法
public class Phone implements UsbInterface {//实现接口就是把接口的方法实现
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机通知工作");
    }
}
