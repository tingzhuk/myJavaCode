package com.wxledu.enum_;

/**
 * @author 王鑫磊
 * @version 1.0
 * 演示 Enum 类的各种方法的使用
 */
public class EnumMethod {
    public static void main(String[] args) {
        //使用 Season02 枚举类，演示各种
        Season02 autumn = Season02.AUTUMN;
        //输出枚举对象的名字
        System.out.println(autumn.name());
        // ordinal()  方法输出的是常量对象是第几的次序，从 0 开始编号    因为他是第三个，因此输出的 2
        System.out.println(autumn.ordinal());
        //从反编译可以看出 values()  方法， 返回的 Season02[]
        // 含有定义的所有枚举对象
        System.out.println("=====遍历取出枚举对象=====");
        Season02[] values = Season02.values();
        for (int i = 0; i < values.length; i++) {// 普通 for 循环
            System.out.println(values[i]);
        }
        System.out.println("==============");
        for (Season02 season: values){//增强 for 循环   一次从 values 数组中取出元素 赋给 season  如果取完了则退出
            System.out.println(season);
        }

        // valueOf()  将字符串转为枚举对象，要求字符串必须为已有的常量名，否则报异常
        //执行流程
        //1. 根据你输入的 "AUTUMN"  到 Season02 的枚举对象中找
        //2. 如果找到了就返回，没找到没救报异常
        Season02 autumn1 = Season02.valueOf("AUTUMN");
        System.out.println("autumn1 = " + autumn1);
        System.out.println(autumn == autumn1); // true

        //compareTo  比较两个枚举常量，比较的就是编号
        //解读
        //就是把 Season02.AUTUMN  的编号 和 Season02.SUMMER  的 编号进行比较
        //   return self.ordinal - other.ordinal;
        // 意思是 Season02.AUTUMN 编号 - Season02.SUMMER 编号
        System.out.println(Season02.AUTUMN.compareTo(Season02.SUMMER)); //-1
    }
}
