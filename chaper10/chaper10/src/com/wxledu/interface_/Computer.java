package com.wxledu.interface_;

public class Computer {
    //编写一个方法, 计算机开始工作
    public void work(UsbInterface usbInterface){
        //规定接口的相关方法，老师规定的，及规范.....
        //通过接口调用方法
        usbInterface.start();
        usbInterface.stop();
    }
}
