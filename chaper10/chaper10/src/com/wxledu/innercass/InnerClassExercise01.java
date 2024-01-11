package com.wxledu.innercass;

import com.wxledu.abstract_.AA;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        //当做实参直接传递，简介高效
        f1(
                new Il() {
                    @Override
                    public void show() {
                        System.out.println("这是一幅名画");
                    }
                }
        );
    }

    public static void f1(Il il){
        il.show();
    }
}


//接口
interface Il{
    void show();
}