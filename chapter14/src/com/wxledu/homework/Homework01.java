package com.wxledu.homework;

import java.util.ArrayList;

/**
 * @author 王鑫磊
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        News n1 = new News("新冠确诊病例超千万，数百万印度教信徒赴恒河\"圣浴\"引民众担忧");
        News n2 = new News("男子突然想起两个月前钓的鱼还在网兜里，捞起一看赶快放生");
        News n3 = new News("12345");
        list.add(n1);
        list.add(n2);
        list.add(n3);
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(processTitle(((News)list.get(i)).getTitle()));
        }
    }

    // 专门写一个方法处理标题
    public static String processTitle(String title){
        if (title == null){
            return "";
        }

        if (title.length() > 15){
            return title.substring(0, 15) + "...";
        }else {
            return title;
        }
    }
}

class News{
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public News() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\''  +
                '}';
    }
}
