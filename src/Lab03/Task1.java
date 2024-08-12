
package Lab03;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your amount: ");
        double amount = input.nextDouble();
        double cents = amount * 100 ;
        int dollars = (int)cents / 100 ;
        int remCents = (int)cents % 100 ;
        int Quat =  (int)remCents/25;
         remCents =  (int) remCents % 25 ;
        int dimes =  (int) remCents / 10 ;
        remCents = (int) remCents % 10 ;
        int nickel = remCents / 5 ;
        remCents = remCents % 5 ;
        int pennies = remCents ;
        System.out.println("Dollars: "+dollars);
        System.out.println("Quarters :"+Quat);
        System.out.println("Dimes: " +dimes);
        System.out.println("Nickels: " +nickel);
        System.out.println("Pennies:"+pennies);
    }
}
