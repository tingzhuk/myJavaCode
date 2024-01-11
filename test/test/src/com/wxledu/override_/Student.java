package com.wxledu.override_;

public class Student extends Person{
    private String id;
    private int score;

    public Student() {
    }

    public Student(String name, int age, String id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    @Override
    public String say() {
        return super.say() + "，我的学号是" + this.id + "，我的分数是" + score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
