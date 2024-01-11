package com.wxledu.interface_;

/**
 * 演示接口的多态传递
 */
public class InterfacePolyPass {
    public static void main(String[] args) {
        //接口类型的变量可以指向，实现了该接口的类的对象实例
        IG ig = new Teacher();
        // 如果 IG 继承了 IH 接口， 而Teacher 实现了 IG 接口
        // 那么实际上就相当于 Teacher 这个类实现了 IH 接口
        // 这就是所谓的接口多态的传递现象
        IH ih = new Teacher();
    }
}

interface IH{}
interface IG extends IH{}

class Teacher implements IG{

}