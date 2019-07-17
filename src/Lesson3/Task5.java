package Lesson3;

public class Task5 {

    public static void main(String[] args) {
        int[][] da = new int[5][5];


        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                da[i][j] = (int) (Math.random() * 2);
            }
        }
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                System.out.print(da[i][j]);
            }
            System.out.println();


        }
    }
}