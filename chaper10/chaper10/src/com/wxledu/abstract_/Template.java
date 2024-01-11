package com.wxledu.abstract_;

abstract public class Template {//抽象类
    public abstract void job();//抽象方法

    public void calculateTime(){//实现方法，调用了job
        //得到当前时间
        long start = System.currentTimeMillis();
        job();//动态机制绑定
        //得到结束的时间
        long end = System.currentTimeMillis();
        System.out.println("执行的时间为" + (end-start));
    }
}
