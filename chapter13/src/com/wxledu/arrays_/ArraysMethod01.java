package com.wxledu.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class ArraysMethod01 {
    public static void main(String[] args) {

        Integer arr[] = {-1, 23, 45, -9, 4};
        //运行排序
        // 老韩解读
        //1. 可以直接使用冒泡排序， 也可以直接只用 Arrays 提供的 sort 方法
        // 2. 因为数组时引用类型， 所以通过sort排序后直接影响到 实参 arr
        // 3. sort 是重载的， 也可以通过传入一个接口 Comparator
        // 4. 调用定制排序时，传入两个参数（1）排序数组 arr
        // (2) 实现了 Comparator 接口的匿名内部类，要求实现compare 方法
        // 5. 先演示效果再解释

        // 6. 源码分析 ：
        Arrays.sort(arr, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println("====排序后=====");
        System.out.println(Arrays.toString(arr));

    }
}
