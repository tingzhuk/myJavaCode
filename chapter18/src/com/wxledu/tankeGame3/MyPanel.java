package com.wxledu.tankeGame3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author 王鑫磊
 * @version 1.0
 * 坦克大战的额绘图区域
 */

// 为了监听键盘事件  实现 KeyListener
// 为了让 Panel 不停的绘制子弹, 需要将 MyPanel 实现 Runnable , 当做一个线程使用
public class MyPanel extends JPanel implements KeyListener, Runnable {
    // 定义我的坦克
    MyTank myTank = null;
    // 定义敌人的坦克  放到 Vector 中
    Vector<EnemyTank> enemyTanks = new Vector<>();
    // 定义一个 Vector 用于存放炸弹
    // 当子弹击中坦克时就加入
    Vector<Bomb> bombs = new Vector<>();
    int enemyTankSize = 3;

    // 定义三张炸弹图片，用于显示爆炸效果
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;


    public MyPanel() {
        myTank = new MyTank(400, 400); //初始化自己的坦克
        myTank.setSpeed(2); // 初始化坦克的速度

        // 初始化敌人的额坦克
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            enemyTank.setDirect(2);
            // 启动敌人坦克，让他动起来
            new Thread(enemyTank).start();
            // 给 enemyTank 加入一颗子弹
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
            // 加入到 enemyTank 的 vector 中
            enemyTank.shots.add(shot);
            // 启动 shot 对象
            new Thread(shot).start();
            enemyTanks.add(enemyTank);
        }

        // 初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750); //填充矩形默认黑色

        if (myTank != null && myTank.isLive) {
            // 画出坦克 - >  封装方法
            drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirect(), 1);
        }


        // 画出敌人的额坦克  遍历 Vector
        for (int i = 0; i < enemyTanks.size(); i++) { // 当敌人坦克存活，才画出
            EnemyTank enemyTank = enemyTanks.get(i);
            // 判断敌人坦克是否存活
            if (enemyTank.isLive) {
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);

                // 画出 enemyTank 的所有子弹
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    // 取出子弹
                    Shot shot = enemyTank.shots.get(j);

                    if (shot.isLive()) { // 如果子弹存活
                        g.draw3DRect(shot.getX(), shot.getY(), 3, 3, false);
                    } else {
                        // 坦克子弹不存活了  移除
                        enemyTank.shots.remove(shot);
                    }
                }
            }


        }

        // 画出我方坦克子弹
//        if(myTank.getShot() != null && myTank.getShot().isLive()){
//            g.fill3DRect(myTank.shot.getX(), myTank.shot.getY(), 3, 3,false);
//        }

        // 将 myTank 的子弹 shots 遍历取出
        for (int i = 0; i < myTank.shots.size(); i++) {
            Shot shot = myTank.shots.get(i);
            if (shot != null && shot.isLive()) {
                g.fill3DRect(shot.getX(), shot.getY(), 3, 3, false);
            }else { // 如果 该 shot 对象已经无效，就从结合中拿掉
                myTank.shots.remove(shot);
            }
        }


        // 如果 bombs 中有炸弹，就画出
        for (int i = 0; i < bombs.size(); i++) {
            // 取出炸弹
            Bomb bomb = bombs.get(i);
            // 根据当前的 bomb 的 life 值来判断用哪个图片当爆炸效果
            if (bomb.life > 6) {
                g.drawImage(image1, bomb.x, bomb.y, this);
            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y, this);
            } else {
                g.drawImage(image3, bomb.x, bomb.y, this);
            }

            // 让炸弹的额生命值减少
            bomb.lifeDown();
            // 如果 bomb 的 life 为 0 了，就从 bomb 的集合中删除
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }

        }
    }

    //编写方法 ，画出坦克

    /**
     * @param x      坦克左上角 x 的坐标
     * @param y      坦克左上角 y 的坐标
     * @param g      画笔
     * @param direct 坦克方向，上左下右
     * @param type   坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {

        // 先判断坦克是什么类型
        switch (type) {
            case 0: // 我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1: //敌人的坦克
                g.setColor(Color.yellow);
                break;
        }

        // 根据坦克的方向来绘制 坦克
        // direct 表示方向(0: 向上  1： 向右 2：向下 3：向左 )
        switch (direct) {
            case 0: // 向上的
                //画出坦克左边的轮子
                g.fill3DRect(x, y, 10, 60, false);
                // 右边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);
                //画中间的矩形  即坦克的盖子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                // 画中间的圆
                g.fillOval(x + 10, y + 20, 20, 20);
                //炮筒
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1: // 向右的
                //画出坦克上边的轮子
                g.fill3DRect(x, y, 60, 10, false);
                // 下边的轮子
                g.fill3DRect(x, y + 30, 60, 10, false);
                //画中间的矩形  即坦克的盖子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                // 画中间的圆
                g.fillOval(x + 20, y + 10, 20, 20);
                //炮筒
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2: // 向下的  换一下炮筒的方向
                //画出坦克左边的轮子
                g.fill3DRect(x, y, 10, 60, false);
                // 右边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);
                //画中间的矩形  即坦克的盖子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                // 画中间的圆
                g.fillOval(x + 10, y + 20, 20, 20);
                //炮筒
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3: // 向左的
                //画出坦克上边的轮子
                g.fill3DRect(x, y, 60, 10, false);
                // 下边的轮子
                g.fill3DRect(x, y + 30, 60, 10, false);
                //画中间的矩形  即坦克的盖子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                // 画中间的圆
                g.fillOval(x + 20, y + 10, 20, 20);
                //炮筒
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
            default:
                System.out.println("暂时不处理");
        }
    }


    // 编写方法，判断敌人的坦克是否击中了我方坦克
    public void hiMyTank(){
        // 遍历所有的敌人坦克
        for (int i = 0; i < enemyTanks.size(); i ++){
            // 取出敌人的坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            // 遍历 enemyTank 的 所有子弹
            for (int j = 0; j < enemyTank.shots.size(); j++){
                // 取出子弹
                Shot shot = enemyTank.shots.get(j);
                // 判断shot 子弹是否击中我方坦克
                if (myTank.isLive && shot.isLive()){
                    hiT(shot,myTank);
                }
            }
        }
    }

    // 判断我方坦克是否被击中
    public void hiT(Shot s, MyTank myTank){
        // 判断 s 是否击中坦克
        switch (myTank.getDirect()) {
            case 0: // 坦克向上
            case 2: // 坦克向下
                if (s.getX() > myTank.getX() && s.getX() < myTank.getX() + 40
                        && s.getY() > myTank.getY() && s.getY() < myTank.getY() + 60) {

                    s.setLive(false);
                    myTank.isLive = false;
                    // 当地方坦克被我方击中后， 就让 被击中的坦克从vector 中移除
                    // 创建一个 Bomb 对象加入到 bombs 中
                    Bomb bomb = new Bomb(myTank.getX(), myTank.getY());
                    bombs.add(bomb);

                    enemyTanks.remove(myTank);
                    break;
                }

            case 1: // 坦克向右
            case 3: // 坦克向左

                if (s.getX() > myTank.getX() && s.getX() < myTank.getX() + 60
                        && s.getY() > myTank.getY() && s.getY() < myTank.getY() + 40) {

                    s.setLive(false);
                    myTank.isLive = false;
                    // 当地方坦克被我方击中后， 就让 被击中的坦克从vector 中移除
                    // 创建一个 Bomb 对象加入到 bombs 中
                    Bomb bomb = new Bomb(myTank.getX(), myTank.getY());
                    bombs.add(bomb);

                    enemyTanks.remove(myTank);
                    break;

                }

        }
    }






    // 如果我们的坦克乐意发射多颗子弹
    // 在判断我方子弹是否击中敌方子弹时，就需要把我们的子弹集合中
    // 所有的子弹，都取出来和敌方所有坦克进行判断


    // 编写方法，判断我方坦克是否击中敌方的坦克
    public void hiTank(Shot s, EnemyTank enemyTank) {
        // 判断 s 是否击中坦克
        switch (enemyTank.getDirect()) {
            case 0: // 坦克向上
            case 2: // 坦克向下
                // 枚举 myTank 所有的子弹
                for (int i = 0; i < myTank.shots.size(); i++) {
                    if (s.getX() > enemyTank.getX() && s.getX() < enemyTank.getX() + 40
                            && s.getY() > enemyTank.getY() && s.getY() < enemyTank.getY() + 60) {

                        s.setLive(false);
                        enemyTank.isLive = false;
                        // 当地方坦克被我方击中后， 就让 被击中的坦克从vector 中移除
                        // 创建一个 Bomb 对象加入到 bombs 中
                        Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                        bombs.add(bomb);

                        enemyTanks.remove(enemyTank);
                    }
                }
                break;
            case 1: // 坦克向右
            case 3: // 坦克向左

                for (int i = 0; i < myTank.shots.size(); i++) {
                    if (s.getX() > enemyTank.getX() && s.getX() < enemyTank.getX() + 60
                            && s.getY() > enemyTank.getY() && s.getY() < enemyTank.getY() + 40) {

                        s.setLive(false);
                        enemyTank.isLive = false;
                        // 当地方坦克被我方击中后， 就让 被击中的坦克从vector 中移除
                        // 创建一个 Bomb 对象加入到 bombs 中
                        Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                        bombs.add(bomb);

                        enemyTanks.remove(enemyTank);

                    }
                    break;

                }
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    // 处理 w d s a 按下的情况
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) { // 按下w 改变坦克方向
            myTank.setDirect(0);
            if (myTank.getY() > 0) {
                myTank.moveUp(); // 坦克向上移动
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) { // 按下 d 改变坦克方向
            myTank.setDirect(1);
            if (myTank.getX() + 60 < 1000) {
                myTank.moveRight(); // 坦克向右移动
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) { // 按下 s 改变坦克的方向
            myTank.setDirect(2);
            if (myTank.getY() + 60 < 750) {
                myTank.moveDown(); // 坦克向下移动
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) { // 按下 a  改变坦克的方向
            myTank.setDirect(3);
            if (myTank.getX() > 0) {
                myTank.moveLeft(); // 坦克向左移动
            }
        }

        // 如果用户按下的是 J 就发射
        if (e.getKeyCode() == KeyEvent.VK_J) {

            // 判断 myTank的子弹是否销毁  发射一颗子弹
//            if (myTank.shot == null || !myTank.shot.isLive()) {
//                myTank.shotEnemyTank();
//            }

            // 发射多颗子弹
            myTank.shotEnemyTank();

        }

        // 重绘 坦克
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() { // 每隔 100 毫秒 重绘区域
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // 判断是否击中了 敌人的坦克
            if (myTank.shot != null && myTank.shot.isLive()) { // 当我的坦克还存活，我就判断敌人的坦克
                // 遍历敌人所有的坦克
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i); // 判断坦克是否被击中
                    hiTank(myTank.shot, enemyTank);
                }
            }
            hiMyTank();

            this.repaint();
        }
    }
}
