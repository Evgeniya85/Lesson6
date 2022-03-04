package lesson6;


import java.util.Arrays;
import java.util.Random;

public class Rondom {
    public static void main(String[] args) {

        int[] arr15 = new int[15];
        Random rd = new Random();

        for (int i = 0; i < arr15.length; i++) {
            arr15[i] = nextInt(rd, 20, -20);
        }

        int min, max = min = arr15[0];

        System.out.println(Arrays.toString(arr15));

        for (int i : arr15) {
            min = Math.min(min, i);
            max = Math.max(max,i);
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }

    public static int nextInt(Random r, int max, int min){
        return r.nextInt(Math.abs(max - min) + 1) + min;
    }
}


