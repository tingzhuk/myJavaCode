package com.wxledu.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("金瓶梅新", 90);
        books[2] = new Book("青年文摘20年", 5);
        books[3] = new Book("java从入门到放弃", 300);

        // 按照价格进行排序
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                Integer i1 = (int) o1.getPrice();
                Integer i2 = (int)o2.getPrice();
                return i1 - i2;
            }
        });

        System.out.println(Arrays.toString(books));

        // 按书名字长短进行排序
        Arrays.sort(books, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book)o1;
                Book book2 = (Book) o2;
                return book2.getName().length() - book1.getName().length();
            }
        });

        System.out.println(Arrays.toString(books));

    }
}

class Book{
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
