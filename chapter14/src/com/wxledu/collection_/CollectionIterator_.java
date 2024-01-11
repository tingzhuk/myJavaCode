package com.wxledu.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class CollectionIterator_ {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new Book("红楼梦","曹雪芹", 34.5));
        list.add(new Book("骆驼祥子","老舍", 34.5));
        list.add(new Book("西游记","吴承恩", 34.5));

//        System.out.println("list = " + list);
        //现在希望遍历集合
        // 1. 先得到集合对应的迭代器
        Iterator iterator = list.iterator();
        // 2. 使用while 循环遍历即可
//        while(iterator.hasNext()){ // 判断是否还有数据
//         System.out.println(iterator.next());
//            // 返回下一个元素 类型 Object    运行类型真正存放的对象
//            Object next = iterator.next();
//            System.out.println(next);
//        }
        // 快速生成 while 循环   itit回车
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        // 3.  当退出 while  循环后 iterator  得带器 指向了最后的元素
        // 4. 如果希望在此遍历需要重置迭代器
        iterator = list.iterator(); // 重置迭代器
        // 第二次遍历
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

        // 显示所有的快捷键的快捷键  ctrl + j
    }
}

class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
