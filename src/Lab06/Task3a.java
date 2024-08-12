package Lab06;
import java.util.Scanner;
public class Task3a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between (0-15): ");
        int num = input.nextInt();
        char hex;
        int hexvalue;
        if (num >= 0 && num <= 9)
            System.out.println("Hex value of "+num+"is "+num);
        else if (num >= 10 && num <= 15) {
            hexvalue = (num - 10) + 'A';
            hex = (char) hexvalue;
            System.out.println("Hex value of "+num+" is "+hex);
        }
        else
            System.out.println("Invalid output");
    
    }
    
}
