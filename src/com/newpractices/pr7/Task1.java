package com.newpractices.pr7;

import static java.lang.Integer.parseInt;

public class Task1 {

    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 3000 рублей";
        text = text.replace(" ","").replace(",","").replace("-","");
        int nach = 0, kon = 0;
        for(int i = 0; i<text.length(); i++) {
            if (text.charAt(i) == 1083) {
                nach = i+1;
                break;
            }
        }
        for(int i = nach+1;i<text.length();i++) {
                if (text.charAt(i) > 47 && text.charAt(i) < 58) {
                    i++;
                    kon = i;
                }
                else{
                    break;
                }
            }
        String vasya = text.substring(nach,kon);
        nach = 0; kon = 0;
        for(int i = 0; i<text.length(); i++) {
            if (text.charAt(i) == 1072 && text.charAt(i+1)> 47 && text.charAt(i+1) < 58) {
                nach = i+1;
                break;
            }
        }
        for(int i = nach+1;i<text.length();i++) {
            if (text.charAt(i) > 47 && text.charAt(i) < 58) {
                i++;
                kon = i;
            }
            else{
                break;
            }
        }
        String masha = text.substring(nach,kon);
        System.out.println("Вася и Маша заработали:"+(parseInt(vasya)+parseInt(masha)));
    }
}
