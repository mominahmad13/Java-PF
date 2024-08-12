package Assign1;
import java.util.Scanner;
public class AscendingOrder {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
        System.out.println("Enter your First Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter your Second Number: ");
        int num2 = input.nextInt();
        System.out.println("Enter your Third Number: ");
        int num3 = input.nextInt();
        int temp ;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Display the numbers in ascending order
        System.out.println("Numbers in non-deceasing order : " + num3 +  num2 + num1);


    }
}
