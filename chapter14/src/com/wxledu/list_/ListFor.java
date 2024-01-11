package com.wxledu.list_;

import java.util.*;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class ListFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        // list 接口的实现子类 vector  LinkedList
        List list = new LinkedList();

        list.add("tom");
        list.add("jack");
        list.add("天龙八部");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

        System.out.println("====增强for======");
        for(Object o : list){
            System.out.println(o);
        }
    }
}
