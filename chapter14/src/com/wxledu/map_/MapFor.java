package com.wxledu.map_;


import java.util.*;

/**
 * @author 王鑫磊
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超","孙俪");
        map.put("王宝强","马蓉");
        map.put("宋计","马蓉");
        map.put("刘令博","null");

        // 第一种： 先取出 所有 的 key ，再根据key 取出对应的value
        Set keySet = map.keySet();
        // (1) 增强 for
        System.out.println("=====增强for======");
        for (Object key : keySet) {
            System.out.println(key + "-" + map.get(key));
        }
        // (2) 迭代器
        System.out.println("======第二种=====");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        // 第一种：把所有的 values 取出
        Collection values = map.values();
        // 这里可以使用所有 Collection 的遍历方式
        // (1) 增强 for
        System.out.println("===取出所有的 value====");
        for (Object value : values) {
            System.out.println(value);
        }
        //（2）迭代器
        System.out.println("-------取出所有的 value-------");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value =  iterator1.next();
            System.out.println(value);
        }

        // 第三组 ： 通过 entrySet 来获取 k-v
        Set entrySet = map.entrySet(); // Entry<Entry<k,v>>
        // (1) 增强 for
        System.out.println("-----使用 entrySet 来获取 k-v -----");
        for (Object entry : entrySet) {
            // 将 entry 转成 Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        // (2) 迭代器
        Iterator iterator2 = entrySet.iterator();
        System.out.println("-----使用 entrySet 的 迭代器---");
        while (iterator2.hasNext()) {
            Object entry = iterator2.next();
            // 向下转型 Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
    }
}
