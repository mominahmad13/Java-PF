package Lab04;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a numeric value of day: ");
        int day = input.nextInt();
        System.out.println("Enter value of Month: ");
        int month = input.nextInt();
        System.out.println("Enter value of year( last two digits ): ");
        int year = input.nextInt();
        if ( year == month * day)
            System.out.println("Day is Magic");
        else
            System.out.println("Day is not Magic");

    }
}
