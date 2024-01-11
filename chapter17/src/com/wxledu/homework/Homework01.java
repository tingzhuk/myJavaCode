package com.wxledu.homework;

import java.util.Scanner;

/**
 * @author 王鑫磊
 * @version 1.0
 * 通过 b 线程去释放 a 线程
 */
public class Homework01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();
    }
}


class A extends Thread{
    boolean loop = true;
    @Override
    public void run() {
        while (loop){
            System.out.println((int) (Math.random() * 100 + 1));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{
    private A a;

    public B(A a){ //构造器传入一个 A 的对象
        this.a = a;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入（Q）：");
            char c = sc.next().toUpperCase().charAt(0);
            if (c == 'Q'){
                a.loop = false;
                System.out.println("退出了 b 线程");
                break;
            }
        }
        System.out.println("退出了 a 线程");
    }
}