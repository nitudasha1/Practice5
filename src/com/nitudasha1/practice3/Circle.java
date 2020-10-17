package com.nitudasha1.practice3;

import java.util.Scanner;
public class Circle {
    public int r;
    public String color;
    public void Parameters(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите радиус окружности");
        r=sc.nextInt();
        System.out.println("Введите цвет окружности");
        color=sc.next();
        System.out.println("Радиус: "+r+" цвет:"+color);
    }
}
class CircleTest{
    public static void main(String[] args){
        Circle c1= new Circle();
        Circle c2= new Circle();
        c1.Parameters();
        c2.Parameters();
    }
}