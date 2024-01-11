package com.wxledu.threaduse;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class ThreadMothed03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();

        // 如果我们希望 main 线程结束后， 子线程也结束
        // 那么我们只需要将子线程设置为  守护线程
        for (int i = 0; i < 10; i++) {
            System.out.println("宝强在辛苦的工作~~~");
            Thread.sleep(1000);
        }
    }
}

class MyDaemonThread extends Thread{
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("马蓉和宋劫在快乐的聊天~~~~");
        }
    }
}
