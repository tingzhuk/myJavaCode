package com.wxledu.list_;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("张三丰");
        list.add("贾宝玉");

        // 在索引等于 1  的位置插入一个对象
        list.add(1, "韩顺平");

        System.out.println("list = " + list);

        // addAll 在 index 位置将集合中的所有位置加进来
        List list2 = new ArrayList();
        list2.add("tom");
        list2.add("jack");
        list.addAll(1, list2);

        System.out.println("list = " + list);

        // indexOf  返回 obj 在集合中首次出现的位置
        System.out.println(list.indexOf("tom"));
        //lastIndexOf  返回 obj  在集合中最后一次出现的位置
        list.addAll(1,list2);
        System.out.println("list = " + list);
        System.out.println(list.lastIndexOf("tom"));

        //remove  移除指定位置的元素，并返回
        list.remove(0);
        System.out.println(list);

        //set 设定指定未指定额元素 为 ele  相当于替换
        list.set(0,"韩顺平");
        System.out.println(list);

        // subList()  返回  从 fromList  到  toIndex  的元素
        List list3 = list.subList(0, 2);  // 返回的子集合 [fromIndex , toIndex)
        System.out.println(list3);
    }
}
