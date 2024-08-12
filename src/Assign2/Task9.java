package Assign2;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        String rev = "";
        for (int i=s.length()-1; i>=0; i--)
            rev += s.charAt(i);
        System.out.println(rev);

    }
    
}
