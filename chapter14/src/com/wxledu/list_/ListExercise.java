package com.wxledu.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class ListExercise {
    @SuppressWarnings("all") //不显示所有警告
    public static void main(String[] args) {
        /*
        添加 10  个以上元素（比如 String "hello"） ， 在 2 号位插入元素"韩顺平教育"
        获得第五个元素，删除第六个元素，修改第七个元素，在使用迭代器遍历集合
        要求：使用 List 的实现类 ArrayList 完成
         */

        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello" + i);
        }

        System.out.println("list = " + list);

        list.add(1,"韩顺平教育");
        System.out.println("list = " + list);

        System.out.println("第五个元素 = " + list.get(4));

        list.remove(5);
        System.out.println("list = " + list);
        //修改第七个元素
        list.set(6, "三国演义");
        System.out.println("list = " + list);


        //使用迭代器遍历集合
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
