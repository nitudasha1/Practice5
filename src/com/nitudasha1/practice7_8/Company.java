package com.nitudasha1.practice7_8;


import java.util.*;

public class Company {
    ArrayList<Employee> list = new ArrayList<>();
    public int inc;
    Random rand = new Random();

    int getIncome() {
        inc = rand.nextInt(19_000_001) + 1_000_000;
        return inc;
    }

    void hire(Employee a) {
        list.add(a);
    }

    void hireAll(ArrayList<Employee> people) {
        list.addAll(people);
    }

    void fire(int index) {
        for (int i = 0; i < list.size(); i++) {
            if (i == index) {
                list.remove(i);
            }
        }
    }



    public ArrayList getLowestSalaryStaff(int count) {
        ArrayList<Employee> one = list;
        Collections.sort(one);
        ArrayList<Employee> two = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            two.add(one.get(i));
        }
        return two;
    }

    public List getTopSalaryStaff(int count) {
        List<Employee> one = new ArrayList<>(list);
        Collections.sort(one);
        Collections.reverse(one);

        List<Employee> two = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            two.add(one.get(i));
        }
        return two;
    }
    int getListSize(){
        return list.size();
    }

}