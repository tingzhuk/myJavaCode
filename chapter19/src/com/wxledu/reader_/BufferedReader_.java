package com.wxledu.reader_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 王鑫磊
 * @version 1.0
 * 演示 BufferedReader 的使用
 */
public class BufferedReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\a.cpp";
        // 创建 BufferedReader 对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        // 读取
        String line; //按行读取，效率高
        // 说明
        // 1. bufferedReader。readLine()  是按行读取文件
        // 2. 当返回  null  是则表示文件读取完毕
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

        // 关闭流  只需要关闭我们的  bufferedReader 因为底层会自动去关闭
        bufferedReader.close();
    }
}
