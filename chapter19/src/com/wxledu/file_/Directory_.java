package com.wxledu.file_;

import org.junit.Test;

import java.io.File;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class Directory_ {
    public static void main(String[] args) {

    }

    @Test
    public void m1(){
        String filePath = "d:\\news02";
        File file = new File(filePath);

        if (file.exists()){
            if (file.delete()){
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println(filePath + "删除失败");
            }
        } else {
            System.out.println("该文件不存在");
        }
    }


    // 判断 D:\\demo02 是否存在，存在就删除，否则就提示不存在
    // 我们这里需要体会到，在java 编程中，目录也可以当做文件
    @Test
    public void m2(){
        String filePath = "D:\\demo02";
        File file = new File(filePath);
        if (file.exists()){
            if (file.delete()){
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println(filePath + "删除失败");
            }
        } else {
            System.out.println(filePath + "目录不存在");
        }
    }


    // 判断 D:\\demo\\a\\b\\c 目录是否存在，如果存在就提示存在，不存在就创建
    // 创建一级目录 mkdir()  创建多级目录 mkdirs()
    @Test
    public void m3(){
        String directoryPath = "D:\\demo\\a\\b\\c";
        File file = new File(directoryPath);
        if (file.exists()){
            System.out.println(directoryPath + "目录存在");
        } else {
            if (file.mkdirs()){
                System.out.println(directoryPath + " 该目录创建成功");
            } else {
                System.out.println(directoryPath + "创建失败");
            }
        }
    }
}
