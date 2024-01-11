package com.wxledu;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int cpuNums = runtime.availableProcessors();
        System.out.println("当前有 cpu 个数" + cpuNums);
    }
}
