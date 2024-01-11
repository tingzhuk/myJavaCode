package com.wxledu.tankeGame3;

import javax.swing.*;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class WxlTankGame01 extends JFrame {
    //定义一个 MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        WxlTankGame01 wxlTankGame01 = new WxlTankGame01();
    }

    public WxlTankGame01(){
        mp = new MyPanel();
        // 将 mp 放到 Thread 中并启动
        new Thread(mp).start();
        this.add(mp); //面板就是游戏的绘图区域
        this.setSize(1000,750);
        this.addKeyListener(mp); //打开键盘的监听事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
