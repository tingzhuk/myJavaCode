package com.wxledu.homweork;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        String str = "abcdef";
        try {
            str = reverse(str, 1, 0);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(str);


    }

    public static String reverse(String str, int start, int end){

        // 对输入的参数进行验证
        // 老韩重要的编程技巧分享
        // (1) 写出正确情况
        // (2) 然后取反即可
        // (3) 这样写你的思路就不乱
        if(!(str != null && start >= 0 && end < str.length() && start <= end)){
            throw new RuntimeException("参数不正确");
        }

        char[] c = str.toCharArray();
        for (int i = start, j = end; i <= j; i++, j--){
            char t = c[j];
            c[j] = c[i];
            c[i] = t;
        }
//        String string = String.valueOf(c);
        return new String(c);
    }
}
