package com.wxledu.homework;


import javafx.scene.control.Cell;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone("诺基亚");
        phone.testWork(new Computer() {
            @Override
            public double work(double n1, double n2) {
                return  n1 + n2;
            }
        }, 6, 4);
    }
}

interface Computer{
    public double work(double n1, double n2);
}

class CellPhone{
    private String name;

    public CellPhone(String name) {
        this.name = name;
    }

    public void testWork(Computer computer,double n1, double n2){
        double work = computer.work(n1, n2);
        System.out.println("计算后的结果是 ：" + work);
    }
}
