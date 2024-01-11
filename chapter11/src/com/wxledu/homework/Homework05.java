package com.wxledu.homework;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.method();
    }
}

class AA{
    private String name = "tom";
    void method(){
        class BB{
            private final String name = "jack";

            public void show(){
                System.out.println(name + " " + "外部类的 name = " + AA.this.name);
            }
        }
        BB bb = new BB();
        bb.show();
    }
}
