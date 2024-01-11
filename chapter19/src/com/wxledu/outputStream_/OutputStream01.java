package com.wxledu.outputStream_;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class OutputStream01 {
    public static void main(String[] args) {

    }

    /**
     * 演示使用 FileOutputStream 写入文件中
     * 如果文件不存在，就创建文件
     */
    @Test
    public void writeFile(){

        String filePath = "D:\\a.txt";
        // 创建 FileOutputStream 对象
        FileOutputStream fileOutputStream = null;

        try {
            // 得到 fileOutPutStream 对象

            // 1. new FileOutputStream(filePath) 创建方式，写入的内容是，会覆盖原来的内容
            // 2. new FileOutPutStream(filePath, true) 创建方式，写入的内容是，追加到文件的后面
            fileOutputStream = new FileOutputStream(filePath, true);
            // char - > int
            // 写入一个字节
            // fileOutputStream.write('H');

            // 写入一个字符串
            // str.getBytes() 可以把字符串 - > 字节数组
            String str = "hello,world!";
            // fileOutputStream.write(str.getBytes());

            /*
            write(byte[] b, int off, int len)
            将 len字节从位于偏移量 off的指定字节数组写入此文件输出流。
             */

            fileOutputStream.write(str.getBytes(), 0, str.length());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
