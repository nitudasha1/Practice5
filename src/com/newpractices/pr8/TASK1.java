package com.newpractices.pr8;

import java.util.ArrayList;
import java.util.Scanner;
class Commands {
    static ArrayList<String> todolist = new ArrayList<>();
    static void LIST(){
        for(String item : todolist){
            System.out.println(item);
        }
    }
    static void ADD(String deal){
        todolist.add(deal);
    }
    static void ADD(int index, String deal){
        todolist.add(index,deal);
    }
    static void EDIT(int index, String deal){
        todolist.remove(index);
        todolist.add(index, deal);
    }
    static void DELETE(int index){
        todolist.remove(index);
    };
}
public class TASK1 {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите команду");
            String command = in.nextLine();
            if (command.equals("LIST")) {
                Commands.LIST();
            }
            if (command.contains("ADD")) {
                int num = 0;
                int index;
                String deal, str ="";
                if (command.charAt(4) > 47 && command.charAt(4) < 58) {
                    for (int i = 4; i < command.length(); ++i) {
                        if (command.charAt(i) != ' ') {
                            num = i;
                            str += command.charAt(i);
                        }
                        else {
                            break;
                        }
                    }
                    index = Integer.parseInt(str);
                    deal = command.substring(num + 1);
                    Commands.ADD(index, deal);
                } else {
                    deal = command.substring(4);
                    Commands.ADD(deal);
                }
            }
            if (command.contains("EDIT")) {
                int num = 0;
                int index;
                String deal, str = "";
                for (int i = 5; i < command.length(); ++i) {
                    if (command.charAt(i) != ' ') {
                        num = i;
                        str += command.charAt(i);
                    }
                    else {
                        break;
                    }
                }
                index = Integer.parseInt(str);
                deal = command.substring(num + 1);
                Commands.EDIT(index,deal);
            }
            if (command.equals("DELETE")) {
                int index = in.nextInt();
                Commands.DELETE(index);
            }
        }
    }

}