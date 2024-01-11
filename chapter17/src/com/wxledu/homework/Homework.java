package com.wxledu.homework;

/**
 * @author 王鑫磊
 * @version 1.0
 *
 * 要求
 * 1. 有两个用户分别从 同一张卡里取钱（总额 ： 10000）
 * 2. 每次都取 1000 ，当余额不足时， 就不用取了
 * 3. 不能出现超取现象 => 线程同步问题
 */
public class Homework {
    public static void main(String[] args) {
        T t = new T();
        Thread thread1 = new Thread(t);
        thread1.start();
        Thread thread2 = new Thread(t);
        thread2.start();
    }
}

/*
class Qu extends Thread{

    public static int money = 10000;
    private static boolean loop = true;

    public void setLoop(boolean loop){
        this.loop  =loop;
    }

    // 定义一个取钱方法， 因为有多个用户，取同一张卡上面的钱
    public static synchronized void drawMoney(){
        if (money <= 0){
            System.out.println("当前余额不足，请改天来取");
            loop = false;
            return;
        }

        System.out.println(Thread.currentThread().getName() + "取了1000元，剩" + (money -= 1000));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        while(loop){
            drawMoney();
        }
    }
}

*/

// 1. 多个线程同时共享访问同一变量， 实现 Runnable

class T implements Runnable{
    private int money = 10000;

    @Override
    public void run() {
        while (true){

            // 多个线程互斥的对共享变量进行访问
            synchronized (this){
                if (money <= 0){
                    System.out.println("余额不足");
                    break;
                }

                money -= 1000;
                System.out.println(Thread.currentThread().getName() + "取了 1000 元， 剩" + money);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
