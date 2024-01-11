package com.wxledu.date_;

import java.util.Calendar;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Calendar01 {
    public static void main(String[] args) {
//        java.util.Calendar
        // 1. calendar 这个类是抽象的，并且构造器是私有化的
        // 2. 可以通过 getInstance 来获取实例
        // 3. 还提供了大量的方法和字段
        // 4. Calendar 没有专门的格式方法需要程序员自己进行组合
        // 5 .如果我们需要按照 24 小时制  Calendar.HOUR  ->  Calendar.HOUR_OF_DAY

        Calendar c = Calendar.getInstance(); // 获取 Calendar 的 对象
        System.out.println("c = " + c);

        // 2. 过的日历对象的 某个日历字段
        System.out.println("年： " + c.get(Calendar.YEAR));
        System.out.println("月： " + (c.get(Calendar.MONTH) + 1));
        System.out.println("日：" + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时：" + c.get(Calendar.HOUR));
        System.out.println("分钟：" + c.get(Calendar.MINUTE));
        System.out.println("秒：" + c.get(Calendar.SECOND));

        // Calendar 没有专门的格式方法需要程序员自己进行组合
    }
}
