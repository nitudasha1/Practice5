package com.nitudasha1.practice1;

import java.util.Scanner;
public class Task5 {
    public static void main(String[] arg){
        System.out.println("Your number");
        Scanner in=new Scanner(System.in);
        int d = in.nextInt();
        int k=1;
        for(int i=1;i<=d;i++){
            k=k*i;
        }
        System.out.println("Factorial:"+k);
    }
}