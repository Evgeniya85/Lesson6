package lesson6;

import java.util.Scanner;

public class March {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Ведите первое число: ");
        String a = console.nextLine();
        System.out.print("Ведите второе число: ");
        int b = console.nextInt();
        int resultInt=Math.max(Integer.parseInt(a), b);
        int resultDouble= (int) Math.min(Double.parseDouble(a), Double.parseDouble(String.valueOf(b)));
        System.out.println(resultInt);
        System.out.println(resultDouble);

    }
}
