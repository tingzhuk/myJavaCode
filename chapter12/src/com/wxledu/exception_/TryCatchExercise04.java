package com.wxledu.exception_;

import java.util.Scanner;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class TryCatchExercise04 {
    public static void main(String[] args) {
        //如果用户输入的不是一个整数提示他反复输入，知道输入整数为止
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        while (true){
            System.out.println("请输入你要输入的内容：");
            try {
                num = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是整数");
            }
        }
        System.out.println("你输入的整数为 ： " + num);
    }
}
