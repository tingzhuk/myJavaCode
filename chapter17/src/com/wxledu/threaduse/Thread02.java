package com.wxledu.threaduse;

/**
 * @author 王鑫磊
 * @version 1.0
 * 实现接口 Runnable 来开发线程
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
//        dog.star()  这里不能调用 start 方法因为 Runnable 就没有 start 方法
        // 创建 Thread 对象， 把dog对象（实现了 Runnable 接口） 放入Thread
        Thread thread = new Thread(dog);
        thread.start();
    }
}

class Dog implements Runnable{

    int num = 0;
    @Override
    public void run() {

        while(true){
            System.out.println("小狗汪汪叫" + " " + num + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(num == 10){
                break;
            }
        }
    }
}
