package com.wxledu.writter_;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class FileWriter_ {
    public static void main(String[] args) {

    }

    @Test
    public void fileWriter01(){
        String filePath = "d:\\note.txt";
        // 创建  FileWriter 对象
        FileWriter fileWriter = null;

        char[] chars  = {'a', 'b', 'c'};

        try {
            fileWriter = new FileWriter(filePath);  // 默认是覆盖
            // 1. writer(int)  写入单个字符
            fileWriter.write('H');

            // 2. writer(char[])  写入字符数组
            fileWriter.write(chars);

            // 3. 写入数组的指定部分  writer(char, off, len)
            fileWriter.write("韩顺平教育".toCharArray(), 0, 3);

            // 4. 写入一个字符串 writer(string)
            fileWriter.write(" 你好北京");
            fileWriter.write("风雨之后，定见彩虹");

            // 5. 写入字符串的指定部分 writer(string, off, len)
            fileWriter.write("天津上海", 0, 2);

            // 在数据量大的情况下，可以使用循环操作

            System.out.println("程序结束 ~ ");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            // 对应 FileWriter 一定要关闭这个流， 或者 flush 这个流，才能把数据写入
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
