package com.wxledu.ticket;

import sun.security.krb5.internal.Ticket;

/**
 * @author 王鑫磊
 * @version 1.0
 * 使用多线程，模拟三个窗口同时售票 100 张
 */
public class SellTicket {
    public static void main(String[] args) {
        // 创建三个售票窗口
        SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket01 sellTicket02 = new SellTicket01();
        SellTicket01 sellTicket03 = new SellTicket01();

        sellTicket01.start();
        sellTicket02.start();
        sellTicket03.start();

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
