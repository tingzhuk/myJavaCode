package com.wxledu.list_;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);


        System.out.println("linkedList = " + linkedList);

        // 因为 LinkedList 实现了 List接口  遍历方式

        // 1. 迭代器遍历
        System.out.println("=====迭代器遍历======");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next = " + next);
        }
        // 2. 增强 for  循环
        System.out.println("=====增强for循环====");
        for (Object o : linkedList) {
            System.out.println("o = " + o);
        }

    }
}
