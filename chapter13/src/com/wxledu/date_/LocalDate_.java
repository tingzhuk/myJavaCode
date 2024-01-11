package com.wxledu.date_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class LocalDate_ {
    public static void main(String[] args) {
        // 第三代日期
        //LocalDateTime
        // 1. 使用 now 方法返回当前时间的独对象
        // 2. 使用 DateTimeFormatter 进行格式化
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");


        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println("年 ： " + ldt.getYear());

        String format = dateTimeFormatter.format(ldt);
        System.out.println("格式化的日期是 + " + format);
    }
}
