package com.wxledu.writter_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 王鑫磊
 * @version 1.0
 * 演示 BufferedWriter 的使用
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\ok.txt";
        // 创建一个 BufferedWriter
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
        bufferedWriter.write("hello, wxl");
        bufferedWriter.newLine(); // 插入一个换行
        bufferedWriter.write("hello, wxl");
        bufferedWriter.newLine();
        bufferedWriter.write("hello, wxl");
        // 插入一个换行
        bufferedWriter.newLine();

        // 说明关闭外层流即可，传入的 new FileWriter(filePath) 会在底层关闭
        bufferedWriter.close();
    }
}
