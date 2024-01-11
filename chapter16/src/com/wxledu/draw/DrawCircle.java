package com.wxledu.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author 王鑫磊
 * @version 1.0
 * 演示如何在面板上画圆形
 */
public class DrawCircle extends JFrame{  //JFrame  对应一个窗口， 可以理解为 一个画框

    //定义一个面板
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle(){ //构造器
        //初始化面板
        mp = new MyPanel();
        //把面板放入窗口（画框）
        this.add(mp);
        //设置窗口大小
        this.setSize(400, 300);
        // 点击窗口的 小 ×  ， 程序就完全退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true); //可以看到
    }
}

// 1. 先定义 一个面板 MyPanel,  继承 JPanel类， 后面我们画图形就在这个面板上画
class MyPanel extends JPanel{

    // MyPanel  理解为画板
    // Graphics g   把 g  理解为 画笔
    // Graphics   提供了很多画图的方法
    @Override
    public void paint(Graphics g) {//绘图方法
        super.paint(g); //调用父类的方法完成初始化
        System.out.println("paint方法被调用");
//        g.drawOval(5, 5,100,100);

        // 画图片 drawImage(Image img, int x, int y, ....)
        // 1. 获取图片资源  /bg.png  表示在该项目的根目录去 获取 bg.png  图片资源
        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bg.png"));
//        g.drawImage(image, 10, 10, 175, 221, this);

        // 这只颜色
        g.setColor(Color.red);
        // 设置字体
        g.setFont(new Font("隶书",Font.BOLD,50));
        // 设置的 x y  是北京你好的  左下角
        g.drawString("北京你好",100,100);
    }
}
