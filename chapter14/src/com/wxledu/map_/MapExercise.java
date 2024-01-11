package com.wxledu.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 王鑫磊
 * @version 1.0
 */
public class MapExercise {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("001",new Employee("张三",4444,"001"));
        map.put("002",new Employee("李四",20000,"002"));
        map.put("003",new Employee("王五",19999,"003"));

        Set keySet = map.keySet();
        System.out.println("=====第一种=====");
        for (Object key :keySet) {
            Employee e = (Employee) map.get(key);
            if(e.getSal() > 18000)
                System.out.println(key + "-" + e);
        }

        // entrySet
        System.out.println("====第二种====");
        Set entrySet = map.entrySet();
        for (Object entry : entrySet) {
            Map.Entry m = (Map.Entry) entry;
            Employee e = (Employee) m.getValue();
            if(e.getSal() > 18000){
                System.out.println(m.getKey() + "-" + m.getValue());
            }
        }


    }
}

class Employee{
    private String name;
    private double sal;
    private String id;

    public Employee(String name, double sal, String id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id='" + id + '\'' +
                '}';
    }
}
