package com.wxledu.debug_;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 10, 100, -20};
        //我们看看Arrays.sort方法的底层实现。--->Debug
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + '\t');
        }
    }
}
