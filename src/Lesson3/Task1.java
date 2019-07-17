package Lesson3;

public class Task1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int b = 0; b < a.length; b++) {
            System.out.println(a[b]);

            for (int c = a.length - 1; c >= 0; c--) {
                System.out.println(a[c]);
            }
        }
    }
}


