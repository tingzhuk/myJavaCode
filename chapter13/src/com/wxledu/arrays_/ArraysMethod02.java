package com.wxledu.arrays_;

import java.util.Arrays;
import java.util.List;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 90, 123, 456};
        // binarySearch 通过二分搜索进行查找， 要求必须排好序
        //解读
        // 1. 使用  binarySearch 二叉查找
        // 2. 要求该数组是有序的，如果该数组是无序的，不能使用 binarySearch 二叉查找
        // 3. 如果数组中不存在该元素，就返回 -1
        int index = Arrays.binarySearch(arr, 123);
        System.out.println(index);

        //copyOf 数组元素复制
        // 老韩解读
        // 1. 从 arr 数组中 ，拷贝 arr.length 元素到 newArr 中
        // 2. 拷贝的长度大于 arr.length, 则就在新的数组后面增加 null
        // 3. 如果拷贝长度 < 0  就抛出  NegativeArraySizeException
        Integer[] newArr = Arrays.copyOf(arr,arr.length + 1);
        System.out.println("====拷贝执行完毕=======");
        System.out.println(Arrays.toString(newArr));

        // fill 数组元素填充
        // 解读
        // 1. 使用 99 去填充 num， 可以理解成替换原来的元素
        Integer[] num = new Integer[]{9, 3, 2};
        Arrays.fill(num, 99);
        System.out.println("==== num 数组填充后 =====");
        System.out.println(Arrays.toString(num));

        // equals 比较两个数组元素是否完全一样
        // 1. 如果 arr 和 arr1 元素一样，则方法返回 true， 否则返回 false
        Integer[] arr1 = {1, 2, 3, 5, 678, 99};
        boolean equals = Arrays.equals(arr, arr1);
        System.out.println(equals);

        // asList 将一组值转换成 List
        // 解读
        // 1. asList 方法，会将 (1, 2, 3, 4, 5, 6) 转换成一个 List 集合
        // 2. 返回 list 编译类型 List<接口>
        // 3. asList 运行类型  class java.util.Arrays$ArrayList
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(list);
        System.out.println("list运行类型" + list.getClass());
    }
}
