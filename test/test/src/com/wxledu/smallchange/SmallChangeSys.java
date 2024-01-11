package com.wxledu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    //可以显示菜单并给出相应的提示
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        //2.完成零钱通明细
        //思路：(1) 可以把收益入账和消费，保存到数组 (2) 可以使用对象 (3) 简单的话可以使用String 拼接
        //零钱通收益明细，这里我们采用字符串拼接的方法最简单
        String detail = "------------零钱通明细-----------";

        //3. 完成收益入账
        double money = 0;
        double balance = 0;
        Date date = null; //date是java.util.Date 类型，表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可用于日期的格式化

        //4. 完场消费
        //定义新变量，记录消费原因
        String explain = "";

        do {
            System.out.println("\n============零钱通菜单==========");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退    出");

            System.out.print("请选择(1-4): ");
            key = scanner.next();
            switch (key){
                case "1":
                    System.out.println(detail);
                    break;
                case "2":
                    System.out.print("收益入账金额：");
                    money = scanner.nextDouble();
                    //在这里需要对money进行一下判断
                    //思路 ：找出不正确金额条件 ，给出提示，直接 break;
                    //过关斩将 校验方式
                    if (money <= 0){
                        System.out.println("收益入账金额需要大于等于0");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    detail += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + "余额：" + balance;
                    //System.out.println(sdf.format(date));
                    break;
                case "3":
                    System.out.print("请输入消费的金额：");
                    money = scanner.nextDouble();
                    //这里需要对输入的金额进行校验
                    //找出不正确的情况
                    if (money <= 0 || money > balance){
                        System.out.println("您的消费金额应该在  0~" + balance + "  之间。");
                        break;
                    }
                    System.out.print("\n请输入消费的说明: ");
                    explain = scanner.next();
                    balance -= money;
                    date = new Date();
                    detail += "\n" + explain + "\t-" + money + "\t" + sdf.format(date) + "\t" + "余额：" + balance;
                    break;
                case "4":
                    String choice = "";
                    //输入是否正确
                    while(true){
                        System.out.println("你确定要退出吗？ y/n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)){
                            break;
                        }
                    }
                    //判断是否退出
                    if ("y".equals(choice)) loop = false;

                    break;

                default:
                    System.out.println("选择有误，请重新选择。");

            }
        }while(loop);

        System.out.println("退出了零钱通系统~");
    }
}
