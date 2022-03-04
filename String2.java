package lesson6;


import java.util.Scanner;



public class String2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Ведите строку из слов, разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”: ");
        String text = console.nextLine();
        text = text.replaceAll("[^a-zA-Z]"," ");
        System.out.println(text);
        String s = text;
        int count = s.split(" ").length;
        System.out.println("Кол-во слов: " + count);

    }
}
