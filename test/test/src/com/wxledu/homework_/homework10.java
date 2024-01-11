package com.wxledu.homework_;

public class homework10 {
    public static void main(String[] args) {
        Doctor_ jack = new Doctor_("jack", 22, "ya", "男", 777);
        Doctor_ tom = new Doctor_("tom", 22, "ya", "男", 777);

        System.out.println(jack.equals(tom));
    }
}

class Doctor_{
    private String name;
    private int age;
    private String job;
    private String gender;
    private double sal;

    public Doctor_(String name, int age, String job, String gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    @Override
    public boolean equals(Object obj) {
        //比较两个对象是否相同
        if (this == obj){
            return true;
        }
        //判断obj 是否是 Doctor类型或其子类
        //过关斩将 校验方式
        if (!(obj instanceof Doctor_)){
            return false;
        }

        //向下转型，因为obj的运行类型是Doctor或者其子类型
        Doctor_ doctor = (Doctor_) obj;
        return this.name.equals(doctor.getName()) && this.age == doctor.getAge() && this.job.equals(doctor.getJob())
                && this.gender.equals(getGender()) && this.sal == doctor.getSal();
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
