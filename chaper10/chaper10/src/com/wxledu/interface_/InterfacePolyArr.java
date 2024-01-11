package com.wxledu.interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {
        //多态数组 ->  接口类型数组
        Usb[] usbs = new Usb[2];
        usbs[0] = new MyPhone();
        usbs[1] = new Camera_();

        for(int i = 0; i < usbs.length; i++){
            usbs[i].work(); //动态绑定......

            //和前面一样，我们仍需对类型进行向下转型、
            if(usbs[i] instanceof MyPhone){ //判断他的运行类型 是 MyPhone
                ((MyPhone)usbs[i]).call();
            }
        }
    }
}

interface Usb{
    void work();
}
class MyPhone implements Usb{
    public void call()
    {
        System.out.println("手机可以打电话");
    }

    @Override
    public void work() {
        System.out.println("手机工作中");
    }
}
class Camera_ implements Usb{
    @Override
    public void work() {
        System.out.println("相机工作中");
    }
}
