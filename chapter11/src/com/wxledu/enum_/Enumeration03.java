package com.wxledu.enum_;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season02.SPRING);
        System.out.println(Season02.AUTUMN);
    }
}

enum Season02{


    //定义四个对象，固定。
//    public final static Season02 SPRING = new Season02("春天", "温暖");
//    public final static Season02 SUMMER = new Season02("夏天", "炎热");
//    public final static Season02 WINTER = new Season02("冬天", "寒冷");
//    public final static Season02 AUTUMN = new Season02("秋天", "凉爽");


    //1. 使用 enmu 替代 class
    //2. public final static Season02 SPRING = new Season02("春天", "温暖");
    // 直接使用  SPRING("春天", "温暖");  替代    解读：常量名（实参列表）
    //3. 如果有多个常量， 以 , 进行间隔即可
    SPRING("春天", "温暖"),
    WINTER("冬天", "寒冷"),
    AUTUMN("秋天", "凉爽"),
    SUMMER("夏天", "炎热");
    private String name;
    private String desc;//描述

    private Season02(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }


    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

