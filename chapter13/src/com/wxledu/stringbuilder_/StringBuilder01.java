package com.wxledu.stringbuilder_;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class StringBuilder01 {
    public static void main(String[] args) {
        // 解读
        // 1. StringBuilder 继承了 AbstractStringBuilder 类
        // 2. 实现了 Serializable , 说明 StringBuilder 对象可以串行化（对象可以网络传输，可以保存文件）
        // 3. StringBuilder 是 final 类， 不能被继承
        // 4. StringBuilder  对象字符序列仍然是存放在其他父类  AbstractStringBuilder 的 char[] value;
        // 因此， 字符序列在堆中
        // 5. StringBuilder 的方法，没有做互斥处理，即没有 synchronized 关键字，因此在单线程情况下使用
        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
    }
}
