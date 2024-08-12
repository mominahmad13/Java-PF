package Lab05;
import java.util.*;
public class Act2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int limit ;
        int number ;
        int sum ;
        int counter;
        System.out.println("Enter the number of " +"Intergers in the list: " );
        limit = input.nextInt();
        System.out.println();
        sum = 0 ;
        counter = 0;
        System.out.println("Enter " +limit + " integers.");
        while (counter < limit) 
        { number = input.nextInt();
          sum = sum + number ;
          counter++;
        }
        System.out.printf("The sum of %d "+"numbers=%d%n",limit,sum);
        if (counter != 0)
            System.out.printf("The average = %d%n", (sum/counter));
        else
            System.out.println("No input.");
    }
    
}
