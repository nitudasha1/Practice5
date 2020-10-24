package com.newpractices.pr6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите команду");
        String command = in.next();
        if (command.equals("LIST")) {
            ToDo mylist = new ToDo();
            mylist.LIST();
        }
        if (command.equals("ADD")) {

        }
        if (command.equals("EDIT")) {

        }
        if (command.equals("DELETE")) {

        }
    }

}