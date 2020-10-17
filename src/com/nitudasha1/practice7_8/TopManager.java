package com.nitudasha1.practice7_8;

public class TopManager extends Employee implements EmployeePosition{
    public double baseSalary=100000, bon;
    Company inc;
    public TopManager(String name,String surname,Company inc){
        this.name=name;
        this.surname=surname;
        this.inc=inc;
        this.position="TopManager";
        this.salary = baseSalary;
        if (inc.getIncome()>10_000_000){
            bon= 1.5*baseSalary;
        }
    }

    @Override
    public String getJobTitle() {
        return position;
    }

    @Override
    public double calcSalary() {
        this.salary=baseSalary+bon;
        return salary;
    }

    @Override
    public String toString() {
        return "TopManager{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + getJobTitle() + '\'' +
                ", salary=" + calcSalary() +
                '}';
    }
}