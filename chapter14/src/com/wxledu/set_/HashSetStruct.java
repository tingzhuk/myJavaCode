package com.wxledu.set_;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class HashSetStruct {
    public static void main(String[] args) {
        // 模拟 HashSet 的底层结构  （HashMap）

        // 1. 创建一个数组，数组的类型是  Node
        // 有些人直接把Node 数组称为 table
        Node[] table = new Node[16];


        // 2. 创建节点
        Node john = new Node("john", null);
        Node jack = new Node("jack", null);
        Node rose = new Node("rose", null);
        john.next = jack;  // 将 jack 挂在到 john
        jack.next = rose; // 将 rode 挂载到 jack
        table[2] = john;

        Node lucy = new Node("lucy", null);
        table[3] = lucy; // 将 lucy 放到索引为 3 的位置

        System.out.println("table = " +table);
    }
}

class Node{
    // 节点可以存放数据，可以指向下一个节点，从而形成链表
    Object item; //存放数据
    Node next;  // 指向下一个数据

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}
