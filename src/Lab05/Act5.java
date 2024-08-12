
package Lab05;
import java.util.Scanner;
public class Act5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number , sum = 0 , count ;
        for (count = 0 ; count < 5 ; count ++)
        {  System.out.println("Enter a number:");
            number = input.nextInt();
           sum += number ;
        }
        System.out.println("sum is "+sum);
    }
    
}
