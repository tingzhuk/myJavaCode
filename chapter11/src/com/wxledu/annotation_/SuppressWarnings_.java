package com.wxledu.annotation_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class SuppressWarnings_ {
    // 1.当我们不希望看到这些警告的时候可以使用  @SuppressWarnings  抑制警告信息
    // 2.在大括号中可以抑制（希望不显示的警告信息）
    // 3.可以指定的警告类型
    // 4.@SuppressWarnings  作用范围和放置的位置相关
    // 比如将 @SuppressWarnings 放置在main 方法，他的作用范围只在main 方法
    // 通常我们放在具体的语句，方法或类
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List arrayList = new ArrayList();
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        int i;
        System.out.println(arrayList.get(1));

    }
}
