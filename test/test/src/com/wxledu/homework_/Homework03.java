package com.wxledu.homework_;

public class Homework03 {
    public static void main(String[] args) {
        Professor jack = new Professor("jack",29,"高级职称",10000);
        jack.introduce();
    }

}

class Teacher{
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher() {
    }

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void introduce(){
        System.out.println("name=" + this.name + "\t" + "age=" + this.age + "\t" + "post=" + this.post + "\t"
             + "salary=" + this.salary  );
    }
}

class Professor extends Teacher{
    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("name=" + this.getName() + "\t" + "age=" + this.getAge() + "\t" + "post=" + this.getPost() + "\t"
                + "salary=" + this.getSalary()*1.3  );
    }
}

class SecondProfessor extends Teacher{
    public SecondProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("name=" + this.getName() + "\t" + "age=" + this.getAge() + "\t" + "post=" + this.getPost() + "\t"
                + "salary=" + this.getSalary()*1.2  );
    }
}

class Lecturer extends Teacher{
    public Lecturer(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("name=" + this.getName() + "\t" + "age=" + this.getAge() + "\t" + "post=" + this.getPost() + "\t"
                + "salary=" + this.getSalary()*1.1  );
    }
}
