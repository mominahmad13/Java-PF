package Lab04;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your First Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter your Second Number: ");
        int num2 = input.nextInt();
        System.out.println("Enter your Third Number:");
        int num3 = input.nextInt();
        System.out.println("Enter 1 to print Min value in two integers: ");
        System.out.println("Enter 2 to find value of sign function at that number: ");
        System.out.println("Enter 3 to print Min value in three Integers: ");
        int n = input.nextInt();
        switch (n) {
            case 1:
            if (num1 > num2)
            {
                System.out.println(num2+"is smallest");
            }
            else
                System.out.println(num1+" is smallest");
            break;
            case 2 :
                if  (num1 ==0 )
                    System.out.println("Value of Sign Function:");

                else if ( num1>0)
                    System.out.println("Value of Sign Function: +1");
                else
                    System.out.println("Value of Sign Function: -1");
                break;
            case 3 :
                if (num1 < num2  && num1 < num3)
                    System.out.println(num1+" is smallest");
                if (num2 < num1 && num2 < num3 )
                    System.out.println(num2+" is samllest");
                if (num3<num1 && num3<num2)
                    System.out.println(num3 + " is smallest");
                break;
            default:
                System.out.println("Invalid input");

            }


    }
}
