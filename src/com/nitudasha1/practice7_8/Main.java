package com.nitudasha1.practice7_8;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Company myCompany=new Company();
        for (int i = 0; i < 180; i++){
            Operator op = new Operator("Operat","OR");
            myCompany.hire(op);
        }
        for (int i = 0; i < 80; i++){
            Manager man = new Manager("Man", " AGER");
            myCompany.hire(man);
        }

        for (int i = 0; i < 10; i++){
            TopManager top = new TopManager("Top", "Manager",myCompany);
            myCompany.hire(top);
        }
        System.out.println("Топ 10 самых высоких зарплат");
        ArrayList<Employee> list = (ArrayList<Employee>) myCompany.getTopSalaryStaff(10);
        for (int i = 0; i < list.size(); i++){
            System.out.println(i+1 +" "+ list.get(i));
            System.out.println();}


        System.out.println("Топ 30 самых низких зарплат");
        list = (ArrayList<Employee>) myCompany.getLowestSalaryStaff(30);
        for (int i = 0; i < 30; i++)
            System.out.println(i+1 +" "+list.get(i));
            System.out.println();

        System.out.println("Произошло увольнение 50% сотудиков");
        for(int i=myCompany.getListSize();i>0;i-=2){
            myCompany.fire(i);
        }
        System.out.println("Топ 10 самых высоких зарплат");
        ArrayList<Employee> list1 = (ArrayList<Employee>) myCompany.getTopSalaryStaff(10);
        for (int i = 0; i < list1.size(); i++){
            System.out.println(i+1 +" "+ list1.get(i));
            System.out.println();}


        System.out.println("Топ 30 самых низких зарплат");
        list1 = (ArrayList<Employee>) myCompany.getLowestSalaryStaff(30);
        for (int i = 0; i < 30; i++)
            System.out.println(i+1 +" "+list1.get(i));
            System.out.println();
    }

}
