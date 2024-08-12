package Lab04;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to change-counting game: ");
        System.out.println("Enter number of pennies: ");
        int pennies = input.nextInt();
        System.out.println("Enter number of nickels: ");
        int  nickels = input.nextInt();
        System.out.println("Enter number of dimes: ");
        int dimes = input.nextInt();
        System.out.println("Enter number of quarters: ");
        int quarters = input.nextInt();
        double totalamount = (pennies * 0.01 ) + (dimes*0.1) + (nickels*0.05) + (quarters *0.25);
        if (totalamount == 1.00 )
            System.out.println("Congratulation, You won the game ");
        else if (totalamount > 1.00)
            System.out.println("Sorry, amount entered is greater than 1 $ ");
        else
            System.out.println("Sorry, amount entered is less than 1 $ ");

    }

}
