package com.wxledu.homework_.homework13;

public class homework13_ {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Student("jack",'男',19,"2367547263");
        persons[1] = new Student("tom",'男',22,"2367567263");
        persons[2] = new Teacher("john",'女',45,12);
        persons[3] = new Teacher("smith",'女',28,3);

        for (int i=0; i<persons.length-1; i++){
            for (int j = 0; j < persons.length-i-1; j++) {
                if (persons[j].getAge() < persons[j+1].getAge()){
                    Person p = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = p;
                }
            }
        }

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
            persons[i].printInfo();
            System.out.println("-------------");
        }

        homework13_ homework13 = new homework13_();
        for (int i = 0; i < persons.length; i++) {
            homework13.ab(persons[i]);
        }

    }

    public void ab(Person person){
        if (person instanceof Student){
            ((Student)person).study();
        } else if (person instanceof Teacher) {
            ((Teacher)person).teach();
        }
    }
}
