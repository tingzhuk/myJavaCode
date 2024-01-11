package com.wxledu.stringbuffer_;


/**
 * @author 王鑫磊
 * @version 1.0
 */
public class StringAndStringBuffer {
    public static void main(String[] args) {
        // 看 String ->  StringBuffer
        String str = "hello";
        // 1. 方式一 ：使用构造器
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.length());
        // 2. 方式二： 使用 append() 方法
        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer append = stringBuffer1.append(str);

        // StringBuffer -> String
        StringBuffer stringBuffer2 = new StringBuffer("河南牧业经济学院");
        // 方式一 ：使用 StringBuffer  提供 的 toString 方法
        String s = stringBuffer2.toString();
        // 方式二 ： 使用构造器
        String string1 = new String(stringBuffer2);
    }
}
