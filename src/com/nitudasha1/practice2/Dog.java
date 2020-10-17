package com.nitudasha1.practice2;

import java.util.Scanner;
public class Dog {
    private String name;
    private int age;
    public void Get(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя собаки");
        name=in.nextLine();
        System.out.println("Введите возраст");
        age=in.nextInt();
    }
    public void HumanAge(){
        System.out.println("В человеческих годах этой собаке "+age*7);
    }
    public void ToString(){
        String a= "Имя: "+this.name+" возраст: "+this.age;
        System.out.println(a);
    }
}
class DogTest{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Dog[] dog= new Dog[10];
        int n;
        System.out.println("Введите количество собак");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            dog[i]=new Dog();
            dog[i].Get();
        }
        for (int i=0; i<n;i++){
            dog[i].ToString();
            dog[i].HumanAge();
        }
    }
}