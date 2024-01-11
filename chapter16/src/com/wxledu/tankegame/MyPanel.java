package com.wxledu.tankegame;

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
public class MyPanel extends JPanel  implements KeyListener {
    // 定义我的坦克
    MyTank myTank = null;
    // 定义敌人的坦克  放到 Vector 中
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;

    public MyPanel(){
        myTank = new MyTank(400, 400); //初始化自己的坦克
        myTank.setSpeed(2); // 初始化坦克的速度

        // 初始化敌人的额坦克
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            enemyTank.setDirect(2);
            enemyTanks.add(enemyTank);
        }
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750); //填充矩形默认黑色

        // 画出坦克 - >  封装方法
        drawTank(myTank.getX(), myTank.getY(),g, myTank.getDirect(), 1);

        // 画出敌人的额坦克  遍历 Vector
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),0);
        }
    }

    //编写方法 ，画出坦克

    /**
     *
     * @param x 坦克左上角 x 的坐标
     * @param y 坦克左上角 y 的坐标
     * @param g 画笔
     * @param direct  坦克方向，上左下右
     * @param type  坦克类型
     */
    public void drawTank(int x, int y,Graphics g, int direct, int type){

        // 先判断坦克是什么类型
        switch (type){
            case 0: // 我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1: //敌人的坦克
                g.setColor(Color.yellow);
                break;
        }

        // 根据坦克的方向来绘制 坦克
        // direct 表示方向(0: 向上  1： 向右 2：向下 3：向左 )
        switch (direct){
            case 0: // 向上的
                //画出坦克左边的轮子
                g.fill3DRect(x, y,10,60,false);
                // 右边的轮子
                g.fill3DRect(x+30,y,10,60,false);
                //画中间的矩形  即坦克的盖子
                g.fill3DRect(x+10,y+10,20,40,false);
                // 画中间的圆
                g.fillOval(x+10,y+20,20,20);
                //炮筒
                g.drawLine(x+20,y+30,x+20,y);
                break;
            case 1: // 向右的
                //画出坦克上边的轮子
                g.fill3DRect(x, y,60,10,false);
                // 下边的轮子
                g.fill3DRect(x,y + 30,60,10,false);
                //画中间的矩形  即坦克的盖子
                g.fill3DRect(x+10,y+10,40,20,false);
                // 画中间的圆
                g.fillOval(x+20,y+10,20,20);
                //炮筒
                g.drawLine(x + 30,y + 20,x+60,y+20);
                break;
            case 2: // 向下的  换一下炮筒的方向
                //画出坦克左边的轮子
                g.fill3DRect(x, y,10,60,false);
                // 右边的轮子
                g.fill3DRect(x+30,y,10,60,false);
                //画中间的矩形  即坦克的盖子
                g.fill3DRect(x+10,y+10,20,40,false);
                // 画中间的圆
                g.fillOval(x+10,y+20,20,20);
                //炮筒
                g.drawLine(x+20,y+30,x+20,y + 60);
                break;
            case 3: // 向左的
                //画出坦克上边的轮子
                g.fill3DRect(x, y,60,10,false);
                // 下边的轮子
                g.fill3DRect(x,y + 30,60,10,false);
                //画中间的矩形  即坦克的盖子
                g.fill3DRect(x+10,y+10,40,20,false);
                // 画中间的圆
                g.fillOval(x+20,y+10,20,20);
                //炮筒
                g.drawLine(x + 30,y + 20,x,y+20);
                break;
            default:
                System.out.println("暂时不处理");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    // 处理 w d s a 按下的情况
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W){ // 按下w 改变坦克方向
            myTank.setDirect(0);
            myTank.moveUp(); // 坦克向上移动
        } else if (e.getKeyCode() == KeyEvent.VK_D) { // 按下 d 改变坦克方向
            myTank.setDirect(1);
            myTank.moveRight(); // 坦克向右移动
        } else if (e.getKeyCode() == KeyEvent.VK_S) { // 按下 s 改变坦克的方向
            myTank.setDirect(2);
            myTank.moveDown(); // 坦克向下移动
        } else if (e.getKeyCode() == KeyEvent.VK_A) { // 按下 a  改变坦克的方向
            myTank.setDirect(3);
            myTank.moveLeft(); // 坦克向左移动
        }

        // 重绘 坦克
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
