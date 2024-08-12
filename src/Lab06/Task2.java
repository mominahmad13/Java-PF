package Lab06;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a ascii code: ");
        int ascii = input.nextInt();
        char asciitochar = (char) ascii;
        System.out.println("The charchter for ascii code "+ascii+" is "+asciitochar);
        System.out.println("Enter a character: ");
        char inputchar = input.next().charAt(0);
        int unicode = (int) inputchar;
        System.out.println("The unicode of number is "+unicode);
    }
    
}
