package com.wxledu.homework_.homework13;

public class Student extends Person{
    private String stu_id;

    public Student(String name, char gender, int age, String stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
    public void study(){
        System.out.println("我承诺，我会好好学习");
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    @Override
    public void printInfo() {
        System.out.println("学生的信息:");
        super.printInfo();
        System.out.println("学号：" + this.stu_id);
        this.study();
        System.out.println(this.play());
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "stu_id='" + stu_id + '\'' +
                '}';
    }
}