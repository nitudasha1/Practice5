package com.nitudasha1.practice1;

import java.util.*;
public class Task4 {
    public static void main(String[]args){
        int[] arr1=new int[10];
        int[] arr2=new int[10];
        Random r= new Random();
        System.out.println("Random array1:");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=(int)(Math.random()*100);
            System.out.print(arr1[i]+" ");
        }
        Arrays.sort(arr1);
        System.out.println("\n"+"Sorted array1:");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.print("\n"+"Random array2:"+"\n");
        for (int i=0;i<arr2.length;i++){
            arr2[i]= r.nextInt(100);
            System.out.print(arr2[i]+" ");
        }
        Arrays.sort(arr2);
        System.out.print("\n"+"Sorted array2:"+"\n");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}