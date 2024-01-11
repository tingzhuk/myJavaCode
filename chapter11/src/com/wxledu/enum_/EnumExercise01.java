package com.wxledu.enum_;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class EnumExercise01 {
    public static void main(String[] args) {
        Gender boy = Gender.BOY; //ok
        Gender boy1 = Gender.BOY; //ok
        System.out.println(boy);
        System.out.println(boy == boy1); // true
    }
}

enum Gender{
    BOY, GIRL;
}
