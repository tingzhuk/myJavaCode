package com.wxledu.stringbuffer_;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        // 1. StringBuffer 的直接父类 是  AbstractStringBuilder
        // 2. StringBuffer 实现了 Serializable , 即StringBuffer 的对象可以进行串行化
        // 3. 在父类 AbstractStringBuilder 有属性 char[] value , 不是 final
        //   在 value 数组存放 字符串内容，  因此存放在堆中
        // 4. StringBuffer  是 final  不能被继承
        // 5 . 因为 StringBuffer  字符串内容是存在 char[] value,所在变化不用每次都
        // 跟换地址（即创建新的对象），所以效率高于 String
        StringBuffer stringBuffer = new StringBuffer();
    }
}
