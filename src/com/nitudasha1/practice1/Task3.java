package com.nitudasha1.practice1;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("For:" + sum);
        int i = 0;
        while (i < arr.length) {
            sum = sum + arr[i];
            i++;
        }
        System.out.println("While:" + sum);
        int m = 0;
        do {
            sum += arr[m];
            m++;
        } while (m < arr.length);
        System.out.println("Do while:" + sum);
    }
}
