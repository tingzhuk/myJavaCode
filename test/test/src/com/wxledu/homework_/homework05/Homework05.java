package com.wxledu.homework_.homework05;

public class Homework05 {
    public static void main(String[] args) {
        Worker jack = new Worker("jack", 2500);
        Peasant tom = new Peasant("tom", 3000);
        Waiter smith = new Waiter("smith", 4000);
        Teacher dog = new Teacher("dog", 4500, 267, 50);
        Scientist duck = new Scientist("duck", 23478, 400000);
        jack.printSalary();
        tom.printSalary();
        smith.printSalary();
        dog.printSalary();
        duck.printSalary();
    }
}
class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }
    public void printSalary(){
        System.out.println(getName() + "的全年工资为" + getSalary()*12);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public Worker() {
    }

    @Override
    public void printSalary() {
        super.printSalary();
    }
}

class Peasant extends Employee{
    public Peasant(String name, double salary) {
        super(name, salary);
    }

    public Peasant() {
    }

    @Override
    public void printSalary() {
        super.printSalary();
    }
}

class Waiter extends Employee{
    public Waiter(String name, double salary) {
        super(name, salary);
    }

    public Waiter() {
    }

    @Override
    public void printSalary() {
        super.printSalary();
    }
}

class Teacher extends Employee{
    private int classDay;
    private double classSal;

    public Teacher(String name, double salary, int classDay, double classSal) {
        super(name, salary);
        this.classDay = classDay;
        this.classSal = classSal;
    }

    public Teacher() {}

    @Override
    public void printSalary() {
        System.out.println(getName() + "老师的全年工资为" + (getSalary()*12 + getClassDay()*getClassSal()));
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }
}

class Scientist extends Employee{
    private double bonus;

    public Scientist(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public Scientist() {}

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSalary() {
        System.out.println(getName() + "科学家的全年工资为" + (getSalary()*12 + getBonus()));
    }
}
