package Assign2;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Keep entering integer values and the program will stop once a prime number is entered:");
        boolean isPrime = true;
        int num;
        while (true)
        {
            isPrime = true;
            System.out.print("Enter an integer: ");
            num = input.nextInt();
            for(int i=2; i<=num/2;i++)
                if (num%i==0)
                    isPrime = false;
            if (isPrime==true)
                break;
        }

    }
    
}
