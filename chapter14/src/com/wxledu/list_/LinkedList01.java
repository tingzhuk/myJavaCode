package com.wxledu.list_;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class LinkedList01 {
    public static void main(String[] args) {
        // 模拟一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node lh = new Node("老韩");

        // 连接三个结点形成双向链表
        jack.next = tom;
        tom.next = lh;
        lh.pre = tom;
        tom.pre = jack;

        Node first = jack;  // 让 first 引用指向 jack, 就是双向链表的头结点
        Node last = lh;  // 让 last  引用指向 lh， 就是双向链表的尾结点

        // 演示从头到尾进行遍历
        System.out.println("从 头到尾进行遍历");
        while (true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        // 演示从尾到头进行遍历
        System.out.println("从尾到头进行遍历");
        while (true){
            if(last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }

        // 演示链表的添加和删除元素
        //    在 tom 和 lh  之间插入一个  对象 smith

        // 1. 先创建 一个 Node 对象 名字就是  smith
        Node smith = new Node("smith");

        smith.next = lh;
        smith.pre = tom;
        tom.next = smith;
        lh.pre = smith;

        // 让 first 再次指向 jack
        first = jack;
        // 让 last 重新指向 lh
        last = lh;


        System.out.println("从 头到尾进行遍历");
        while (true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }


    }
}

// 定义一个 Node 类 表示双向链表的一个结点
class Node{
    public Object item; //真正存放数据的地方
    public Node next;  // 指向下一个结点
    public Node pre;  // 指向前一个结点
    public Node(Object name){
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name=" + item;
    }
}
