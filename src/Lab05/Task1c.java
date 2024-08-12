package Lab05;
import java.util.Scanner;
public class Task1c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of integers: ");
        int N = input.nextInt();
        int num = 0;
        int sum = 0;
        System.out.println("Enter "+N+" integers:");
        for ( int i = 0 ; i < N; i++)
        {  num = input.nextInt();
           sum+=num;
        }
        System.out.println("Sum of "+N+" integer is:"+sum);    
        
    }
    
}
