package com.wxledu.tankeGame3;

import java.util.Vector;

/**
 * @author 王鑫磊
 * @version 1.0
 * 敌人的额坦克
 */
public class EnemyTank extends Tank implements Runnable{
    Vector<Shot> shots = new Vector<>();

    // 坦克是否存活
    boolean isLive = true;
    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while (true){

            // 这里如果 shots.size() == 0, 创建一颗子弹放入 shots 并启动
            if(shots.size() == 0 && isLive){

                Shot s = null;
                // 判断 坦克的方向创建子弹
                switch (getDirect()){
                    case 0:
                        s = new Shot(getX() + 20, getY(), 0);
                        break;
                    case 1:
                        s = new Shot(getX() + 60, getY() + 20, 1);
                        break;
                    case 2:
                        s = new Shot(getX() + 20, getY() + 60, 2);
                        break;
                    case 3:
                        s = new Shot(getX(), getY() + 20, 3);
                }

                shots.add(s);
                new Thread(s).start();

            }

            // 根据坦克方向继续移动
            switch (getDirect()){
                case 0:
                    // 让坦克保持一个方向走 30
                    for (int i = 0; i < 30; i++) {
                        if (getY() > 0) {
                            moveUp();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 1:
                    // 让坦克保持一个方向走 30
                    for (int i = 0; i < 30; i++) {
                        if (getX() + 60 < 1000) {
                            moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 2:
                    // 让坦克保持一个方向走 30
                    for (int i = 0; i < 30; i++) {
                        if (getY() + 60 < 750) {
                            moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 3:
                    // 让坦克保持一个方向走 30
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0) {
                            moveLeft();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
            }

            // 休眠 50 毫秒
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // 随机改变坦克的方向 0 - 3
            setDirect((int)(Math.random()*4)); // [0, 4)
            // 一旦写并发程序，一定要考虑清楚，线程啥时候结束
            if (!isLive){
                break; // 退出线程，在创建敌人坦克对象时启动
            }
        }
    }
}
