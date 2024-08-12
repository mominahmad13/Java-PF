
package Lab03;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a digit between 0 and 1000: ");
        int  num  = input.nextInt();
        int sum  = 0 ;
        sum += num % 10 ; // sum = sum + (num %10)
        num /= 10 ; // num = num /10
        sum += num % 10 ;
        num /= 10 ;
        sum += num % 10 ;
        num /= 10 ;
        System.out.println("Sum of digits is: "+sum);
    }
}
