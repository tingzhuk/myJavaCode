package com.wxledu.encap;

public class Pc extends Computer{
    private String brand;

    public Pc(String brand) {
        this.brand = brand;
    }

    //idea直接根据继承，的规则把构造器的调用写好了
    //这里也体现继承设计的基本规则： 父类的构造器完成父类的初始化
    //子类的构造器完成子类的初始化
    public Pc(String cpu, int memory, int hardDisk, String brand) {
        super(cpu, memory, hardDisk);
        this.brand = brand;
    }

    public Pc() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //打印pc的信息
    public void printInfo(){
        System.out.println("pc信息如下：" + getDetail() + ",品牌" + getBrand());
    }
}
