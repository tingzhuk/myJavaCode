package com.wxledu.syn;

import javafx.scene.effect.Bloom;

/**
 * @author 王鑫磊
 * @version 1.0
 * 使用多线程，模拟三个窗口同时售票 100 张
 */
public class SellTicket {
    public static void main(String[] args) {
        // 创建个售票窗口
        SellTicket02 sellTicket02 = new SellTicket02();

        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();

    }
}

// 实现接口问题  使用 Synchronized 实现线程同步
class SellTicket02 implements Runnable{
    public static int ticSum = 100; //使用静态变量，让多个窗口可以共享
    public boolean loop = true; //表示票是否售空

    public SellTicket02() {
    }

    public synchronized void cell(){
        if(ticSum <= 0){
            // 没有票了，提示关闭窗口
            System.out.println("票售空了");
            loop = false; //如果票售空了
            return;
        }

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("窗口" + Thread.currentThread().getName() + "售出了一张票" +
                "剩余" + (--ticSum));
    }

    @Override
    public void run() {

        while(loop){

            cell();

        }
    }
}

class SellTicket01 extends Thread{
    public static int ticSum = 100; //使用静态变量，让多个窗口可以共享

    public SellTicket01() {
    }

    @Override
    public void run() {

        while(true){

            if(ticSum <= 0){
                // 没有票了，提示关闭窗口
                System.out.println("票售空了");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("窗口" + Thread.currentThread().getName() + "售出了一张票" +
                    "剩余" + (--ticSum));
        }
    }
}
