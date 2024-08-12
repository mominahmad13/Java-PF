package Lab04;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of books purchased each month: ");
        int month = input.nextInt();
        switch (month) {
            case 1 :
                System.out.println("You got 5 points");
                break;
            case 2 :
                System.out.println("You got 15 points");
                break;
            case 3 :
                System.out.println("You got 30 points");
                break;
            case 4 :
                System.out.println("You got 60 points");
                break;
            default:
                System.out.println("You  got zero points ");
        }

    }

}
