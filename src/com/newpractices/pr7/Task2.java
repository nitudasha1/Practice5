package com.newpractices.pr7;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String surname, name, father;
        int index1, index2;
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Pattern pattern = Pattern.compile("^[А-Я]?[а-я]+\\s[А-Я]?[а-я]+\\s[-]?[А-Я]?[а-я]*$");
        Matcher matcher = pattern.matcher(text);
        boolean check = matcher.find();
        boolean end = text.endsWith("-");
        if(!check){
            System.out.println("Введенная строка неверна");
        }
        if (check){
                index1 = text.indexOf(" ");
                surname = text.substring(0,index1);
                index2 = text.lastIndexOf(" ");
                name = text.substring(index1+1,index2);
                if(!end){
                    father = text.substring(index2+1);text.length();
                    System.out.println("Фамилия: " + surname + "\n" + "Имя: " + name + "\n" + "Отчество: " + father);
                }
                if(end) {
                    System.out.println("Фамилия: " + surname + "\n" + "Имя: " + name);
                }

        }


    }
}





