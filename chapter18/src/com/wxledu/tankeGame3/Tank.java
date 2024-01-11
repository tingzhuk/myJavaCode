package com.wxledu.tankeGame3;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Tank {
    private int x; //坦克的横坐标
    private int y; //坦克纵坐标
    private int direct; //表示坦克的方向 0  上 1 右 2 下 3 左
    private int speed = 1; // 坦克移动的速度



    // 上 右 下 左 移动方法
    public void moveUp(){
        y -= speed;
    }

    public void moveRight(){
        x += speed;
    }

    public void moveLeft(){
        x -= speed;
    }

    public void moveDown(){
        y += speed;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
