package com.wxledu.fileInpute_;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 王鑫磊
 * @version 1.0
 * 演示 FileInputStream 使用 （字符流 文件 -> 程序）
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    /**
     * 演示读取文件
     * 单个字节读取，效率较低
     * -> 优化， 使用 read(byte[] b) 读取文件，提高效率
     */
    @Test
    public void readFile01(){
        String filePath = "D:\\hello.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            // 创建 fileInputStream 对象，用于读取
            fileInputStream = new FileInputStream(filePath);
            // 从该输入流读取一个字节的数据。 如果没有输入可用，此方法将阻止。
            // 如果返回 -1 表示文件读取完毕
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭文件，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * 使用 read(byte[] b) 读取文件， 提高效率
     */
    @Test
    public void readFile02(){
        String filePath = "D:\\hello.txt";
        int readLen = 0;
        // 字节数组
        byte[] buf = new byte[8];  // 一次读取 8 个字节
        FileInputStream fileInputStream = null;
        try {
            // 创建 fileInputStream 对象，用于读取
            fileInputStream = new FileInputStream(filePath);
            // 从该输入流读取最多b.length字节的数据到字节数组。 此方法将阻塞，直到某些输入可用。
            // 如果返回 -1 表示文件读取完毕
            // 如果读取正常， 返回实际读取的字节数
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf,0,readLen)); // 显示
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭文件，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
