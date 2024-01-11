package com.wxledu.homweork;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        String name = "Han Shun Ping";
        printName(name);
    }

    // 编写方法完成输出要求格式的字符串
    public static void printName(String str){
        // 1. 对输入的字符串进行分割  split(" ")
        // 2. 分割后对得到的数组进行格式化  String.format()
        // 3. 对输入的字符串进行校验

        if(str == null){
            System.out.println("输入的字符串 不能为空");
            return;
        }

        String[] names = str.split(" ");
        if (names.length != 3){
            System.out.println("输入的字符串格式不对  应为  xxxx  xxxx xxxx");
            return;
        }

        String format = String.format("%s,%s.%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
