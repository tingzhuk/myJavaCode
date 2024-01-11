package com.wxledu.collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class CollectionFor {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new Book("红楼梦","曹雪芹", 34.5));
        list.add(new Book("骆驼祥子","老舍", 34.5));
        list.add(new Book("西游记","吴承恩", 34.5));

        // 1. 使用增强for循环  Collection
        // 2. 底层仍然是迭代器
        // 3. 增强 for 就是简化版的迭代器
        for(Object obj : list){
            System.out.println(obj);
        }

        for (Object o :list) {
            System.out.println(o);
        }

        // 增强 for 也可以直接在数组上使用
        int[] nums = {1 , 2 ,3, 4,};
        for(int i : nums){
            System.out.println(i);
        }
    }
}
