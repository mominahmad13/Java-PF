package Assign1;
import java.util.Scanner;
public class ISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first 9 digits
        System.out.println("Enter the first 9 digits of the ISBN:");
        int firstNineDigits = input.nextInt();

        // Calculate the checksum
        int d1 = firstNineDigits / 100000000;

        int d2 = (firstNineDigits / 10000000) % 10;

        int d3 = (firstNineDigits / 1000000) % 10;

        int d4 = (firstNineDigits / 100000) % 10;

        int d5 = (firstNineDigits / 10000) % 10;

        int d6 = (firstNineDigits / 1000) % 10;

        int d7 = (firstNineDigits / 100) % 10;

        int d8 = (firstNineDigits / 10) % 10;

        int d9 = firstNineDigits % 10;

        int checksum = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        System.out.println(checksum);
        String lastDigit;
        if (checksum == 10) {
            lastDigit = "X";
        } else {
            lastDigit = String.valueOf(checksum);
        }
        System.out.println("The 10-digit ISBN is: " + String.format("%09d", firstNineDigits) + lastDigit);
    }
}
