package com.wxledu.tankeGame3;

/**
 * @author 王鑫磊
 * @version 1.0
 * 射击子弹
 */
public class Shot implements Runnable{
    private int x; // 子弹的 x 坐标
    private int y; // 子弹的 y 坐标
    private  int direct = 0; // 子弹的方向
    private  int speed = 2; // 子弹的速度
    private boolean isLive = true; // 子弹是否还存活

    // 构造器
    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() { // 射击

        while (true){
            // 休眠 50 毫秒
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // 根据方向来改变 x y 坐标
            switch (direct){
                case 0: // 上
                    y -= speed;
                    break;
                case 1: // 右
                    x += speed;
                    break;
                case 2: // 下
                    y += speed;
                    break;
                case 3: // 左
                    x -= speed;
                    break;
            }

            // 测试 输出子弹 的 x y 坐标
            System.out.println("子弹  x = " + x + " y = " + y);

            // 当子弹移动到面板边界时就应该销毁（把启动子弹带额线程销毁）
            // 当子弹碰到敌人坦克时，也应该销毁
            if(!(x >=0 && x <= 1000 && y >= 0 && y <= 750 && isLive)){
                isLive = false;
                break;
            }
        }

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

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }
}
