package com.wxledu.list_;

import java.util.ArrayList;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class ArrayListDetail {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        // 1. ArrayList 是线程不安全的 可以看源码，没有 synchronized  修饰
        /*
        public boolean add(E e) {
            ensureCapacityInternal(size + 1);  // Increments modCount!!
            elementData[size++] = e;
            return true;
        }
         */
        // 2. 多线程 使用 vector

        ArrayList list = new ArrayList();
        list.add(null);
        list.add("jack");
        list.add(null);
    }
}
