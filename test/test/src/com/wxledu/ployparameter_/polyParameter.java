package com.wxledu.ployparameter_;

public class polyParameter {
    public static void main(String[] args) {
        Employee worker = new Worker("jack",2500);
        polyParameter.showEmpAnnual(worker);
        Employee[] employees = new Employee[2];
        Employee manage = new manage("tom", 5000, 20000);

        "hello".equals("hello");

    }

    //获得任何员工的年工资
    public static void showEmpAnnual(Employee e){
        System.out.println(e.getName() + "的年工资为" + e.getAnnual());
    }

    public static void testWork(Employee e){
        if (e instanceof Worker){

        }
    }
}
