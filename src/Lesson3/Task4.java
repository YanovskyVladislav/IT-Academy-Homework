package Lesson3;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 90 + 10);
            System.out.print(array[i] + " ");
        }

        for(int i=0;i<array.length;i++){
            if(i>0){
                if(array[i-1]>=array[i]){
                    break;
                }
            }
            if(i==array.length-1)
                System.out.println("Последовательность строго возрастающая");
        }
    }
}
