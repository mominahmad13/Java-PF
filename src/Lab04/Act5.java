package Lab04;
import java.util.Scanner;
public class Act5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter 1,2 or 3: ");
        number = input.nextInt();
    switch (number) {
        case 1 :
            System.out.println("you entered 1: ");
            break;
        case 2 :
            System.out.println("You entered 2: ");
            break;
        case 3 :
            System.out.println("You entered 3: ");
            break;
        default:
            System.out.println("That is not 1, 2 or 3: ");
    }


    }
}
