package Lab04;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 - 10: ");
        int num = input.nextInt();
        if (num > 10 )
            System.out.println("Invalid input");
        if ( num == 1 )
            System.out.println("Roman Numeral: I");
        if ( num == 2 )
            System.out.println("Roman Numeral: II ");
        if ( num == 3 )
            System.out.println("Roman Numeral: III ");
        if ( num == 4 )
            System.out.println("Roman Numeral: IV");
        if ( num == 5 )
            System.out.println("Roman Numeral: V");
        if ( num == 6 )
            System.out.println("Roman Numeral: VI");
        if ( num == 7 )
            System.out.println("Roman Numeral: VII");
        if ( num == 8 )
            System.out.println("Roman Numeral: VIII");
        if ( num == 9 )
            System.out.println("Roman Numeral: IX");
        if ( num == 10 )
            System.out.println("Roman Numeral: X");

    }
}
