package com.wxledu.interface_;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(B.a);
        System.out.println(A.a);
    }
}

interface A{
    int a = 23;  //等价于 => public static final int a = 23;
}

class B implements A{ }
