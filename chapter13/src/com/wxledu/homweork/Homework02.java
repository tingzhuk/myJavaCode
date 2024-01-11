package com.wxledu.homweork;

import java.util.Scanner;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {

        String name = "jack";
        String pwd = "123456";
        String email = "123456@qq.com";

        try {
            boolean r = register(name,pwd,email);
            if (r) System.out.println("注册成功");
        }catch (Exception e){
            System.out.println(e.getMessage());
            return;
        }

    }

    public static boolean register(String name, String pwd, String email){
        // 再加入一些校验
        if(name == null || pwd == null || email == null){
            throw new RuntimeException("参数不能为空");
        }


        // 1. 过关斩将

        // 第一关
        if(!(name.length()>=2 && name.length()<=4)){
            throw new RuntimeException("用户名长度不合法");
        }

        // 第二关
        // 单独的写一个方法，判断某个字符串或者方法是否全部是数字
        if (!(pwd.length() == 6 && isDigital(pwd))){
            throw new RuntimeException("密码格式错误");
        }


        // 第三关
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if(!(i > 0 && j > i)){
            throw new RuntimeException("邮箱中包含 @ 和 . 并且 @ 在 . 的前面");
        }
        return true;

    }

    //判断密码是否全部是数字
    public static boolean isDigital(String pwd){
        char[] charArray = pwd.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(!(charArray[i] >='0' && charArray[i] <= '9')){
                return false;
            }
        }
        return true;
    }
}
