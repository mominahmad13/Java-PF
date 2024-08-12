package Lab07;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a positive real number \"a\": ");
        double a = input.nextDouble();
        System.out.print("Enter a non negative index \"n\": ");
        int n = input.nextInt();
        System.out.println("Result: "+power(a,n));
    }
    public static double power (double a , int n )
    {  if (n == 0)
         return 1;
       else
        return a * power(a,n-1);
    }

}
