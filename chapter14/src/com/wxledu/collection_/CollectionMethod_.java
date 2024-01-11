package com.wxledu.collection_;

import java.util.ArrayList;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class CollectionMethod_ {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        // add 添加单个元素
        list.add("jack");
        list.add(23);  //list.add(new Integer(23))   自动装箱
        System.out.println("list = " + list);

        // remove
//        list.remove(0); // 删除第一个元素
        //list.remove("jack");  //指定删除某个元素
        System.out.println("list = " + list);

        // contains  查找元素是否存在
        System.out.println(list.contains("jack"));

        // size 返回元素的个数
        System.out.println(list.size());

        // isEmpty 判断集合是否为空
        System.out.println(list.isEmpty());

        // clear  清空集合元素
        list.clear();
        System.out.println("list = " + list);

        // addaAll 添加多个元素

        ArrayList list2 = new ArrayList();
        list2.add("红红楼梦");
        list2.add("三国演义");
        list.addAll(list2);
        System.out.println("list = " + list);


        // containsAll 判断多个元素是否存在
        System.out.println(list.containsAll(list2));

        // removeAll 删除多个元素
        list.add("聊斋");
        list.removeAll(list2);
        System.out.println("list = " + list);
    }
}
