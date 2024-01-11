package com.wxledu.writter_;

import java.io.*;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class BufferedCopy_ {
    public static void main(String[] args) {

        // 1. BufferedReader 和 BufferedWriter 是按照字符操作的
        // 2. 不要去操作 二进制文件[声音  视频   .....]  可能会造成文件损坏


        String srcFilePath = "d:\\a.cpp";
        String destFilePath = "d:\\a2.cpp";

        BufferedReader bf = null;
        BufferedWriter bw = null;

        String line;

        try {
            bf = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));

            // 读取
            // 说明： readLine 是读取一行，但是没有带换行
            while ((line = bf.readLine()) != null){
                // 读取一行就行写入
                bw.write(line);
                bw.newLine(); // 换行 和系统相关
            }

            System.out.println("拷贝完毕....");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭流
            try {
                if (bf != null){
                    bf.close();
                }
                if (bw != null){
                    bw.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
