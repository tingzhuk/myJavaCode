package com.wxledu.threaduse;

/**
 * @author 王鑫磊
 * @version 1.0
 * 演示通过继承 Thread 类创建进程
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        // 创建一个 cat  对象， 可以当做线程使用
        Cat cat = new Cat();

        // 启动线程
        cat.start(); // 最终会执行 cat 的 run 方法

        //cat.run();  run 方法就是一个普通的方法，没有真正启动一个线程，就会把 run 方法执行完毕，才会向下执行

        // 当 main 线程 启动一个子线程的时候，主线程不会阻塞，会继续执行
        // 这时主线程和子线程交替执行
        System.out.println("主线程不会阻塞，会继续执行" + Thread.currentThread().getName());  // 主线程的名字就叫 main
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

            Thread.sleep(1000); // 让主线程休眠
        }
    }
}

// 1. 当一个类继承了 Thread 类 该类就可以当做线程使用
// 2. 我们会重写 run 方法，写上自己的的业务代码
// 3. run Thread 类实现了 Runnable 接口的 run 方法
/*
    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }
 */
class Cat extends Thread{
    @Override
    public void run() {
        // 写上自己的额业务逻辑

        int times = 0;
        while(true){
            // 每隔 1 s ，在控制台输出 “喵喵， 我是小猫咪”
            System.out.println("喵喵， 我是小喵咪" + (++times) + " " + Thread.currentThread().getName());

            // 让该线程休眠 1 s
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (times == 80){ // 如果输出了 8 次就退出
                break;
            }
        }

    }
}
