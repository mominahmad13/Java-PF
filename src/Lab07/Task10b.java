package Lab07;
import java.util.Scanner;
public class Task10b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sequence of numbers: ");
        int n = input.nextInt();
        System.out.print("Output: ");
        reverse(n);
        System.out.println();
    }
    public static void reverse(int n){
        if (n<10)
        {
            System.out.print(n);
            return;
        }
        System.out.print(n%10);
        reverse(n/10);

    }
    
}
