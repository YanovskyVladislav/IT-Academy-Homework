package Lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
            System.out.println("Введите два слова почередно");
            Scanner sc = new Scanner(System.in);
            String text1 = sc.next();
            int len1 = text1.length();
            String text2 = sc.next();
            int len2 = text2.length();
            boolean retVal;
            if ((text1.equals(text2))) {
                System.out.println("Отлично! Слова одинаковы");

            } else if (retVal = text1.equalsIgnoreCase(text2)) {
                System.out.println("Хорошо. Почти одинаковы");
            } else if (len1 == len2) {
                System.out.println("Ну, хотя бы они одной длины");

            }


        }

    }

