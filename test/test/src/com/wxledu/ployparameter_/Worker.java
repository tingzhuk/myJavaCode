package com.wxledu.ployparameter_;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getAnnual() {//工作者没有其他收入，因此和员工一样
        return super.getAnnual();
    }

    private void work(){
        System.out.println("worker在工作....");
    }
}
