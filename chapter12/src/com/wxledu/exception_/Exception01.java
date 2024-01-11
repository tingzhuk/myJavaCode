package com.wxledu.exception_;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Exception01 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2  = 0;
        // 解读
        // 1. num1 / num2 => 10 / 0
        // 2. 当执行到 n1 / n2 因为 n2  = 0,程序就会出现（抛出） 异常 ArithmeticException
        // 3. 当抛出异常后 程序就会退出，崩溃了
        // 4. 大家想一想，这样做合理吗？ 不好，不应该出现一个不是致命的问题就导致系统崩溃
        // 5. java 设计者就提出一个异常处理机制来解决这个问题
//        int res  = n1 / n2;
        //如果程序员认为一段代码可能出现问题，可以使用 try - catch ,
        // 从而保证程序健壮性

        //将该代码块 选中 -> 快捷键 ctrl + alt + t  选中 try - catch
        // 6. 如果出现了异常，程序可以继续执行
        try {
            int res = n1 / n2;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出现异常的原因是 ： " + e.getMessage()); //输出异常信息
        }
        System.out.println("程序继续运行");
    }
}
