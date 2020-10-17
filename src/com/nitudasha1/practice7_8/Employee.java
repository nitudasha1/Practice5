package com.nitudasha1.practice7_8;

public class Employee implements Comparable<Employee> {
    public String name, surname, position;
    public double salary;

    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary, o.salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}