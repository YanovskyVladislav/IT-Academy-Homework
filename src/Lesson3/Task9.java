package Lesson3;

import java.util.Scanner;

public class Task9 {


    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);


        int n =  scanner.nextInt();
        int i;
        boolean isComposite = false;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (isComposite) {
            System.out.println("число составное ");
        } else {
            System.out.println("число  простое ");
        }
    }
}
