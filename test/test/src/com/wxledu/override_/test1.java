package com.wxledu.override_;

public class test1 {
    public static void main(String[] args) {
        Person person = new Person("张三",20);
        System.out.println(person.say());

        Student student = new Student("李四",18,"2021",88);
        System.out.println(student.say());
    }
}
