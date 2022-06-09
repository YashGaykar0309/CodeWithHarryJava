package com.company;


class Employee1 {
    int id;
    int salary;
    String name;

    public void printdetails(){
        System.out.println("Name of Employee is "+  name);
        System.out.println("ID of Employee is "+ id);
    }

    public int getSalary(){
        return salary;
    }
}

public class CWH_22_Custom_Class {
    public static void main(String[] args) {
        Employee1 yash=new Employee1();
        yash.name="yash gaykar";
        yash.salary=30000;
        yash.id=55;

        Employee1 jay=new Employee1();
        jay.name="jay hande";
        jay.salary=31000;
        jay.id=54;


//        System.out.println(yash.id);
//        System.out.println(yash.name);

        yash.printdetails();
        jay.printdetails();
        int salary = jay.getSalary();
        System.out.println(salary);


    }
}

