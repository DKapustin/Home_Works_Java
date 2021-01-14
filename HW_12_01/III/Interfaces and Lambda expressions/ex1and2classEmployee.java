package com.company;

public class Employee implements Measurable {
    double salary;
    String name;
    public Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    @Override
    public double getMeasure() {
        return this.salary;
    }

}
