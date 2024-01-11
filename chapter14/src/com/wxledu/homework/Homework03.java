package com.wxledu.homework;


import java.util.*;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
         Map m = new HashMap();
         m.put("jack", 234); // int - > Integer
         m.put("tom", 1200); // int - > Integer
         m.put("smith", 2900); // int - > Integer
        System.out.println(m);

        m.put("jack", 2600);
        System.out.println(m);

        // 为所有的员工 加薪 100
        // keySet
        Set set = m.keySet();
        for (Object key : m.keySet()) {
            //更新
            m.put(key, (Integer)m.get(key) + 100);
        }
        System.out.println(m);

        // 遍历 EntrySet
        Set set1 = m.entrySet();
        // 迭代器
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()) {
            Map.Entry next = (Map.Entry)iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }

        System.out.println("遍历所有的工资");
        Collection values = m.values();
        for (Object value : values) {
            System.out.println("工资" + value);
        }

    }
}
