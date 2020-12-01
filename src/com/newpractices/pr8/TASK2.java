package com.newpractices.pr8;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TASK2 {
    public static class ListOfEmails{
        static TreeSet<String> Emails = new TreeSet();
        static void LIST() {
            for (String item : Emails) {
                System.out.println(item);
            }
        }
        static void ADD(String mail) {
            Pattern pattern = Pattern.compile("([A-Za-z0-9]+[-\\.]?[A-Za-z0-9]+)@([a-z]+[\\.]?)([a-z]+[\\.]{1}[a-z]+)");
            Matcher matcher = pattern.matcher(mail);
            boolean check = matcher.find();
            if (check) {
                Emails.add(mail);
            }
            else{
                System.out.println("Введен некорректный адрес");
            }
        }
    }
    public static void main(String[] args) {
        String mail;
        while(true) {
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            if (text.equals("LIST")) {
                ListOfEmails.LIST();
            }
            if (text.contains("ADD")) {
                mail = text.substring(4);
                ListOfEmails.ADD(mail);
            }
        }
    }
}
