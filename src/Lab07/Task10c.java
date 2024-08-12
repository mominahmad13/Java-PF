package Lab07;
import java.util.Scanner;
public class Task10c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int dec = input.nextInt();
        System.out.println("Output: " + findBinary(dec));
    }
    public static int findBinary(int dec){
        if (dec == 0)
            return 0;
        else
            return (dec%2 + 10 * findBinary(dec/2));

    }
    
}
