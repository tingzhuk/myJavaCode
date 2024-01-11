package com.wxlwdu.generic;

import java.util.*;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class GenericExercise {
    public static void main(String[] args) {
        // 使用泛型 给 HashSet  放入三个学生独像
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("jack",88));
        students.add(new Student("tom",90));
        students.add(new Student("smith",12));

        //遍历
        System.out.println("增强 for 循环");
        for (Student student : students) {
            System.out.println(student);
        }

        // 使用 泛型给 HashMap 传入 三个对象
        HashMap<String, Student> hm = new HashMap<String, Student>();
        hm.put("tom", new Student("tom", 99));
        hm.put("jack", new Student("jack", 12));
        hm.put("smith", new Student("smith", 45));

        System.out.println("------------");

        // 迭代器
        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }
    }
}

class Student{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
