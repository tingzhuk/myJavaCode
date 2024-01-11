package com.wxledu.homweork;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        String str = "fasfghjdksfghdj13434525";
        countStr(str);
    }

    // 1. 遍历字符串， 如果字符在 '0' ~ '9'   'a' ~ 'z'  'A' ~ 'Z'
    // 2. 使用三个变量来记录数据统计的结果

    public static void countStr(String str){
        if (str == null){
            System.out.println("字符串不能为空");
            return;
        }

        int strlen = str.length();
        int numberCount = 0;
        int lowerCount = 0;
        int upperCount = 0;
        int otherCount = 0;
        char[] c = str.toCharArray();
        for (int i = 0; i < strlen; i++) {
            if(c[i] >= '0' && c[i] <= '9'){
                numberCount++;
            }else if (c[i] >= 'a' && c[i] <= 'z'){
                lowerCount++;
            }else if(c[i] >= 'A' && c[i] <= 'Z'){
                upperCount++;
            }
            else {
                otherCount++;
            }
        }

        System.out.println("数字有：" + numberCount);
        System.out.println("小写字母有：" + lowerCount);
        System.out.println("大写字母有：" + upperCount);
        System.out.println("其他字母有：" + otherCount);
    }
}
