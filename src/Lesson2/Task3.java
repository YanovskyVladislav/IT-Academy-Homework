package Lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите год");
        Scanner scanner = new Scanner(System.in);
        int Year = scanner.nextInt();
        if (Year %100==0 && Year %400 ==0)
        {
            System.out.println("Год високосный.");
        } else if(Year % 4 == 0 && Year % 100 > 0)
            System.out.println("Год високосный.");
        else if(Year % 100 == 0)
            System.out.println("Год не високосный.");
        else
            System.out.println("Год не високосный.");
    }
}


