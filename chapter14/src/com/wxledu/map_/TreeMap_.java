package com.wxledu.map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author 王鑫磊
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TreeMap_ {
    public static void main(String[] args) {

        //使用默认的构造器创建 TreeMap， 是无序的（没有什么规则）
        /*
            按照传入的 key 的大小进行排序
            按照字符串长度的大小进行排序
         */
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //return ((String)o2).compareTo(((String) o1));
                return ((String)o1).length() - ((String)o2).length();
                // 这个时候 key 的长度相同的传不进去
            }
        });
        treeMap.put("tom", 123);
        treeMap.put("jack",456);
        treeMap.put("john",789);
        treeMap.put("tom",456);

        System.out.println(treeMap);

        /*

            源码解读：
            1. 构造器 把传入的 Comparator 匿名内部类（对象） ，传给了 TreeMap 的 comparator
            public TreeMap(Comparator<? super K> comparator) {
                this.comparator = comparator;
            }
         */
    }
}
