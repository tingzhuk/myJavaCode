package com.wxledu.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author 王鑫磊
 * @version 1.0
 *  演示通过键盘控制小球的上下所有的移动
 */
public class BallMove extends JFrame{ //窗口
    MyPanel mp = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    //构造器
    public BallMove(){
        mp = new MyPanel();
        this.add(mp); //把面板放入窗口中
        this.setSize(400, 300);
        // 窗口 JFrame 可以监听我们的键盘事件，可以监听到我们的键盘事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //点击叉号退出程序
        this.setVisible(true);
    }
}

// 面板可以画小球
// KeyListener 是一个监听器
class MyPanel extends JPanel implements KeyListener {

    // 为了让小球可以移动， 我们把左上角的坐标设置为变量
    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 20,20);
    }

    // 有字符输出时该方法就会出发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    // 当某个键按下时候该方法会触发
    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println((char) e.getKeyCode() + "被按下......");

        // 根据用户按下的不同键来处理小球的移动
        // 在 java  中会给每一个键来分配一个值
        if(e.getKeyCode() == KeyEvent.VK_DOWN){ //就是向下的箭头对用的  Code  值
            y++;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) { // 按向上的箭头， 就向上移动
            y--;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x--;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x++;
        }

        // 让面板重绘
        this.repaint();
    }

    // 当某个键释放了该方法就会被触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
