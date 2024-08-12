package Lab04;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1= input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter Third Number: ");
        int num3 = input.nextInt();
        if (num1 == num2 && num1 == num3 )
            System.out.println("Output:3");
        if (num1==num2 && num1!=num3)
            System.out.println("Output:2");
        if (num3==num2 && num3!=num1)
            System.out.println("Output:2");
        if (num1==num3 && num2!=num3)
            System.out.println("Output:2");
        if (num3!=num2 && num3!=num1)
            System.out.println("Output:0");
    }
}
