package com.wxledu.reader_;


import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class FileReader_ {
    public static void main(String[] args) {

    }

    /**
     * 读取单个字符
     */
    @Test
    public void fileReader01(){

        String filePath = "d:\\story.txt";
        FileReader fileReader = null;
        int data = 0;
        // 1. 创建 FileReader 对象
        try {
            fileReader = new FileReader(filePath);
            // 循环读取，使用 read  单个字符读取
            while ((data  = fileReader.read()) != -1){
                System.out.print((char) data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileReader != null){
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    /**
     * 字符数组读取文件
     */
    @Test
    public void fileReader02(){

        String filePath = "d:\\story.txt";
        FileReader fileReader = null;
        int readLen = 0;
        char[] buf = new char[8];
        // 1. 创建 FileReader 对象
        try {
            fileReader = new FileReader(filePath);
            // 循环读取，使用 read(buf)  返回实际读取到的字符数
            // 如果返回 -1 说明到文件结束
            while ((readLen  = fileReader.read(buf)) != -1){
                System.out.print(new String(buf, 0 ,readLen));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileReader != null){
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
