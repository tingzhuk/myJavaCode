package com.wxledu.file_;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 王鑫磊
 * @version 1.0
 * 演示创建文件
 */
public class FileCreate {
    public static void main(String[] args) {
        FileCreate fileCreate = new FileCreate();
        fileCreate.create01();
    }

    // 方式一 ： new File(String pathName)
    @Test
    public void create01(){
        String filePath = "D:\\news1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 方式二 ： new File(File parent, String child)
    @Test
    public void create02(){
        File parentFile = new File("D:\\");
        String fileName = new String("news02");

        // 这里的 file 在 java 程序中只是一个对象
        // 只有执行了 createNewFile 方法才会真正的在磁盘创建文件
        File file = new File(parentFile, fileName);

        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
