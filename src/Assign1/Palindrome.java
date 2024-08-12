package Assign1;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a three-digit number: ");
        int num = input.nextInt();
        int firstDigit = num / 100 ;
        int lastDigit = (num % 100)%10 ;
        if (firstDigit == lastDigit)
            System.out.println("The number "+num+" is a Palindrome Number");
        else
            System.out.println("The number "+num+" is not a Palindrome Number");



    }
}
