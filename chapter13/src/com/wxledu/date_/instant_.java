package com.wxledu.date_;

/**
 * @author 王鑫磊
 * @version 1.0
 */

import java.time.Instant;
import java.util.Date;

public class instant_ {
    public static void main(String[] args) {
        // 1. 通过 now() 方法可以获得 表示当前时间戳的对象
        Instant now = Instant.now();
        // 2 .通过 from 可以把 Instant 转换成 Date
        Date from = Date.from(now);
        System.out.println(from);
        // 3. 通过 Date toInstant 可以把 Date 转换成  Instant 独像
        Instant instant = from.toInstant();
    }
}
