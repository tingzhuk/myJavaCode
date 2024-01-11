package com.wxledu.homework;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Homework08 {
    public static void main(String[] args) {
        Color red = Color.RED;
        red.show();
    }
}

interface AB{
    void show();
}
enum Color implements AB{
    RED(255,0,0),BLUE(0,0,255),
    BLACK(0,0,0),YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println(redValue + " " + greenValue + " " + blueValue);
    }
}
