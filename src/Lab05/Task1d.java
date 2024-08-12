package Lab05;
import java.util.Scanner;
public class Task1d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of integers to get the sum of their cube: ");
        int N = input.nextInt();
        int cube;
        int sum = 0;
        System.out.println("Enter "+N+" integers:");
        for ( int i = 1 ; i <= N; i++)
        {   cube = (int) Math.pow(i, 3);
            sum+= cube ;
        }
        System.out.println("Sum of "+N+" integer is:"+sum);    
        
    }
    
}
