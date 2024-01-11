package com.wxledu.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 王鑫磊
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class MapMethod {
    public static void main(String[] args) {
        // 演示 Map 接口常用的方法
        Map map = new HashMap();
        //1. put ： 添加
        map.put("王宝强","666");
        map.put("吴京","5555");
        System.out.println(map);
        //2. remove ： 根据键删除映射关系
        // 3. get：根据键获取值
        //4. size: 获取元素个数
        //5. isEmpty: 判断个数是否为 0
        // 6. clear : 清除
        // . containsKey : 查找键是否存在
    }
}

@SuppressWarnings({"all"})
class Book{
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
