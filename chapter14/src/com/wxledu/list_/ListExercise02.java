package com.wxledu.list_;


import java.util.ArrayList;
import java.util.List;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class ListExercise02 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Book book1 = new Book("水浒传a", 20, "罗贯中");
        Book book2 = new Book("三国演义", 25, "wxl");
        Book book3 = new Book("骆驼祥子", 23, "老舍");

        List list = new ArrayList();
        list.add(book1);
        list.add(book2);
        list.add(book3);

        for (Object o :list) {
            System.out.println(o);
        }


        sort(list);

        System.out.println("======排序后======");

        for (Object o :list) {
            System.out.println(o);
        }


    }

    // 手写冒泡排序
    public static void sort(List list){
        int listSize = list.size();

        for(int i = 0; i < listSize; i++){
            for (int j = 0; j < listSize  - 1 - i; j++){
                // 取出 Book 对象
                Book book1 = (Book)list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()){ //交换
                    list.set(j, book2);
                    list.set(j+1, book1);
                }
            }
        }

    }
}

class Book{
    private String name;
    private int price;
    private String author;

    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "书名：" + name + "\t\t价格：" + price + "\t\t作者：" + author;
    }
}
