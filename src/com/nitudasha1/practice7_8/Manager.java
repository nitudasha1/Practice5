package com.nitudasha1.practice7_8;

import java.util.Random;

public class Manager extends Employee implements EmployeePosition {

    public double bon,  baseSalary = 30000;
    Random rand=new Random();
    public Manager(String name,String surname){
        this.name=name;
        this.surname=surname;
        this.position="Manager";
        this.salary = baseSalary;
        bon=(rand.nextInt(25001)+115_000)*0.05;
    }

    @Override
    public String getJobTitle() {
        return position;
    }

    @Override
    public double calcSalary() {
        this.salary = baseSalary + bon;
        return salary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + getJobTitle() + '\'' +
                ", salary=" + calcSalary() +
                '}';
    }
}
