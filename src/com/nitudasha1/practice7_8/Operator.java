package com.nitudasha1.practice7_8;

public class Operator extends Employee implements EmployeePosition {

    public Operator(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.position = "Operator";
        this.salary = 15000;
    }

    @Override
    public String getJobTitle() {
        return position;
    }

    @Override
    public double calcSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + getJobTitle() + '\'' +
                ", salary=" + calcSalary() +
                '}';
    }
}
