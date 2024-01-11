package com.wxledu.tankeGame3;

import java.util.Vector;

/**
 * @author 王鑫磊
 * @version 1.0
 * 我的坦克
 */
public class MyTank extends Tank{
    // 定义一个 Shot 对象， 表示（射击）
    Shot shot = null;

    // 可以发射多个子弹、
    Vector<Shot> shots = new Vector<>();

    boolean isLive = true;

    public Shot getShot() {
        return shot;
    }

    public void setShot(Shot shot) {
        this.shot = shot;
    }

    public MyTank(int x, int y) {
        super(x, y);
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    // 射击
    public void shotEnemyTank(){

        // 发射多颗子弹怎么办， 最多发射五颗
        if (shots.size() == 5){
            return;
        }

        // 创建 Shot 对象, 根据当前 MyTank 对象的方向
        switch (getDirect()){ // 得到 MyTank 方向
            case 0: // 向上
                shot = new Shot(getX() + 20, getY(), 0);
                break;
            case 1: // 向右
                shot = new Shot(getX() + 60, getY() + 20, 1);
                break;
            case 2: // 向下
                shot = new Shot(getX() + 20, getY() + 60, 2);
                break;
            case 3: // 向左
                shot = new Shot(getX(), getY() + 20, 3);
                break;
        }

        // 把新新创建的 shot 放入到集合中
        shots.add(shot);

        // 启动 Shot 线程
        new Thread(shot).start();
    }
}
