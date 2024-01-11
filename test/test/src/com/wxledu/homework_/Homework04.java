package com.wxledu.homework_;

public class Homework04 {
    public static void main(String[] args) {
        Worker jack = new Worker("jack", 350, 20);
        Manager tom = new Manager("tom", 400, 28);

        jack.printSalary();
        tom.printSalary();
    }
}

class Employee{
    private String name;
    private double oneDaySalary;
    private int days;

    public Employee(String name, double oneDaySalary, int days) {
        this.name = name;
        this.oneDaySalary = oneDaySalary;
        this.days = days;
    }

    public Employee() {
    }

    public void printSalary(){
        System.out.println(getName() + "工资为" + getOneDaySalary()*getDays());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOneDaySalary() {
        return oneDaySalary;
    }

    public void setOneDaySalary(double oneDaySalary) {
        this.oneDaySalary = oneDaySalary;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
class Manager extends Employee {
    public Manager(String name, double oneDaySalary, int days) {
        super(name, oneDaySalary, days);
    }

    public Manager() {
    }

    @Override
    public void printSalary() {
        System.out.println(getName() + "工资为" + (1000 + getOneDaySalary()*getDays()*1.2));
    }
}
class Worker extends Employee {
    public Worker(String name, double oneDaySalary, int days) {
        super(name, oneDaySalary, days);
    }

    public Worker() {
    }

    @Override
    public void printSalary() {
        super.printSalary();
    }
}
