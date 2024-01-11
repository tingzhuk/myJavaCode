package com.wxledu.outputStream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class FileCopy {
    public static void main(String[] args) {
        // 完成文件拷贝 ， 将 e:\\Kola.jpg 拷贝到 c 盘
        // 思路分析
        // 1. 创建文件输入流，将文件读入到程序
        // 2. 创建文件的输出流， 将读取到的文件数据写到指定位置
        String srcFilePath = "e:\\kola.jpg";
        String destFilePath = "d:\\kola.jpg";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);

            // 定义字节数组，提高读取效率
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf)) != -1){
                // 读取到后，就写入到文件 通过 fileOutputStream
                // 即 一边读，一边写
                fileOutputStream.write(buf, 0, readLen); // 一定要用这个方法
            }

            System.out.println("拷贝ok~");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                // 关闭输入流和输出流释放资源
                if (fileInputStream != null){
                    fileInputStream.close();
                }
                if (fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
