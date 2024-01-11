package com.wxledu.stringbuffer_;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class StringBuffer02 {
    public static void main(String[] args) {
        // 构造器的使用
        // 1. 创建 一个 大小为 16  的 char[]，  用于存放数组
        StringBuffer stringBuffer = new StringBuffer();

        // 2. 通过构造器指定 char[]  的大小
        StringBuffer stringBuffer1 = new StringBuffer(20);

        // 3. 通过给定字符串创建  StringBuffer()     字符数组大小  字符串长度 + 16
        StringBuffer stringBuffer2 = new StringBuffer("hello");
    }
}
