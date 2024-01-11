package com.wxledu.homework;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        System.out.println(frock.toString());
        System.out.println(frock1.toString());
        System.out.println(frock2.toString());
    }
}

class Frock{
    private static int currentNum = 100000;
    private int serialNumber;

    public Frock() {
        this.serialNumber = getSerialNumber();
    }

    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }

    public int getSerialNumber(){
        return getNextNum();
    }

    @Override
    public String toString() {
        return "serialNumber = " + serialNumber;
    }
}
