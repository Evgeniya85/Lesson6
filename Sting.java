package lesson6;

public class Sting {
    public static void main(String[] args) {
        boolean result;
        String result1;
        String str_Sample = "I like Java!!!";
        System.out.println("Contains sequence 'Java': " + str_Sample.contains("Java"));
        result = str_Sample.startsWith("I like");
        System.out.println("Contains sequence 'I like': " + str_Sample.startsWith("I like"));
        result = str_Sample.endsWith("!!!");
        System.out.println("Contains sequence '!!!': " + str_Sample.endsWith("!!!"));
        System.out.println(str_Sample.toUpperCase());
        String str = " Java";
         result1= str.replace('a','o');
        System.out.println("Contains sequence 'a  на  о': " + str.replace('a','o'));

           }
}
