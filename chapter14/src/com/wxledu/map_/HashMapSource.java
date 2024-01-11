package com.wxledu.map_;

import java.util.HashMap;

/**
 * @author 王鑫磊
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashMapSource {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("java",10);
        map.put("php",10);
        map.put("java",20); // 替换 value

        System.out.println("map = " + map);

        // 老韩解读 HashMap 的源码
    }
}
