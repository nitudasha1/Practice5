package com.nitudasha1.practice3;

import java.util.Scanner;
public class Book {
    public String author,name;
    public int date;
    public void GetInfo(){
        Scanner sk=new Scanner(System.in);
        System.out.println("Введите название книги");
        name= sk.next();
        System.out.println("Ведите автора");
        author=sk.next();
        System.out.println("Ведите создания книги");
        date= sk.nextInt();
        System.out.println("Название: "+name+"  "+"автор: "+author+"год создания: "+date);
    }
}
class BookTest{
    public static void main(String[] args){
        Book b1=new Book();
        Book b2=new Book();
        b1.GetInfo();
        b2.GetInfo();
    }
}