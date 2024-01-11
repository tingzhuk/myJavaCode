package com.wxledu.wrapper;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Inter01 {
    public static void main(String[] args) {
        // 演示 int <-> Integer 的装箱和拆箱
        // jdk5 前是手动装箱和拆箱
        int n1 = 100;
        Integer integer = new Integer(n1); //手动装箱  int -> Integer
        Integer integer1 = Integer.valueOf(n1);

        // 手动拆箱  Integer -> int
        int i = integer.intValue();

        // jdk5 及其以后 就可以自动装箱拆箱
        int n2 = 200;
        //自动装箱 int -> Integer
        Integer integer2 = n2;  //底层使用的 new Integer()

        //自动拆箱 Integer -> int
        int i1 = integer2;
    }
}
