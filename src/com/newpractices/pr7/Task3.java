package com.newpractices.pr7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        num = num.replace(" ","");
        for(int i = 0; i<num.length();++i){
            if ((int)num.charAt(i)<47||(int)num.charAt(i)>58 ){
                num = removeCharAt(num,i);
            }
        }
        Pattern pattern = Pattern.compile("^[7-8]{1}[9]{1}[0-9]{9}$");
        Matcher matcher = pattern.matcher(num);
        boolean check = matcher.find();
        if (check){
            num = "+7 ("+ num.substring(1,4)
                    + ") " + num.substring(4,7)
                    + "-" + num.substring(7,9)
                    + "-" + num.substring(9,11);
            System.out.println(num);
            return;
        }
        Pattern pat = Pattern.compile("^[9]{1}[0-9]{9}$");
        Matcher match = pat.matcher(num);
        boolean ch = match.find();
        if (ch){
            num = "+7 ("+ num.substring(0,3)
                    + ") " + num.substring(3,6)
                    + "-" + num.substring(6,8)
                    + "-" + num.substring(8,10);
            System.out.println(num);
            return;
        }
        if (!check && !ch){
            System.out.println("Неверный формат номера");
        }
    }
}
