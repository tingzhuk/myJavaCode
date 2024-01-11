package com.wxledu.homework_;

public class Homework01 {
    public static void main(String[] args) {
        Person[] personArr = new Person[3];
        personArr[0] = new Person("jack", 20, "资深算法工程师");
        personArr[1] = new Person("tom", 30, "全栈开发高级工程师");
        personArr[2] = new Person("smith", 25,"产品经理");

        for (int i=0; i<personArr.length-1; i++){
            for (int j = 0; j < personArr.length - 1 - i; j++) {
                if (personArr[j].getAge() < personArr[j+1].getAge()){
                    Person temp = personArr[j];
                    personArr[j] = personArr[j+1];
                    personArr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < personArr.length; i++) {
            System.out.println(personArr[i]);//默认调用 toString 方法
        }
    }
}
class Person{
    private String name;
    private int age;
    private String job;

    public Person() {
    }
    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
