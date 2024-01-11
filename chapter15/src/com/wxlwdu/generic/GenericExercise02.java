package com.wxlwdu.generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author 王鑫磊
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class GenericExercise02 {
    public static void main(String[] args) {
        Employee jack = new Employee("jack", 7777, new MyDate(7, 13, 2003));
        Employee tom = new Employee("tom", 444, new MyDate(7, 19, 2003));
        Employee smith = new Employee("smith", 6666, new MyDate(7, 17, 2003));
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(jack);
        employees.add(tom);
        employees.add(smith);

        System.out.println(employees);

        System.out.println("==对员工进行排序==");

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                // 先对传入的参数进行验证
                if(!(o1 instanceof Employee && o2 instanceof Employee)){
                    System.out.println("==类型不正确==");
                    return 0;
                }

                // 下面是对 birthday 类的比较， 我们最好 把这个比较放在 birthday 类完成
                // 如果名字不相同按照名字进行排序
                int i = o1.getName().compareTo(o2.getName()); //名字相同 i 的值 是 1
                if(i != 0){
                    return i;
                }

                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });

        System.out.println(employees);
    }
}

class Employee{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable<MyDate>{
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
        // 名字相同，按照生日进行排序
        int yearMinus = year - o.getYear();
        if (yearMinus != 0){
            return yearMinus;
        }

        // 如果 year 相同就比较 month
        int monthMinus = month - o.getMonth();
        if (monthMinus != 0){
            return monthMinus;
        }

        // 如果 year  和 month 都 相同 就比较 day
        int dayMinus = day - o.getDay();
        return dayMinus;
    }
}
