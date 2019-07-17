package Lesson3;

public class Task2 {
    public static void main(String[] args) {
        int massive[] = new int[100];
        int i;
        int x = 1;
        for (i = 0; i < massive.length; x++) {
            if (x % 13 == 0) {
                massive[i] = x;
                i++; }
            else if (x % 17 == 0) {
                massive[i] = x;
                i++;}
        }

        for (i = 0; i < massive.length; i++) {
            System.out.println(massive[i]);
        }

    }
}
