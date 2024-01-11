package com.wxledu.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class List_ {
    public static void main(String[] args) {
        // 1.  List 元素有序  即输出的元素和添加的元素顺序相同  且 可以重复
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("wxl");
        list.add("tom");
        System.out.println("list = " + list);

        // 2. List 中的每个元素都有对应的顺序索引
        // 索引是从 0 开始的
        System.out.println(list.get(0));

    }
}
