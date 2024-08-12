package Assign2;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do
        {
            System.out.print("Enter the number of lines from 1-10: ");
            n = input.nextInt();
        } while (n<1 || n>10);
        for (int i=1; i<=n; i++)
        {
            for(int j=n-i; j>=0; j--)
                System.out.print(" " + " ");
            for(int j=i; j>1; j--)
                System.out.print(j + " ");
            for(int j=1; j<=i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
