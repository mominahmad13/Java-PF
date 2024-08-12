package Assign2;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int dec = input.nextInt();
        String binary = "";
        while(dec>0)
        {
            int rem = dec%2;
            binary = rem + binary;
            dec/=2;
        }
        System.out.println(binary);

    }
}
