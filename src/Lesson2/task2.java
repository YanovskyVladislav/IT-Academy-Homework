package Lesson2;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        System.out.println("Введите сумму перевода");
        Scanner scanner = new Scanner(System.in);

        int UserNumber = scanner.nextInt();

        if (UserNumber % 100 == 1 ) {
            System.out.println(UserNumber + " рубль 00 копеек");
        } else if (UserNumber % 10 > 1 && UserNumber % 10 < 5)
            System.out.println(UserNumber + " рубля 00 копеек");
        else if (UserNumber % 100 > 4 && UserNumber % 100 < 21)
            System.out.println(UserNumber + " рублей 00 копеек");
        else System.out.println(UserNumber + " рубль 00 копеек");


    }
}



