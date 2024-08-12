package Lab05;
import java.util.Scanner;
public class Act6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number , max ;
        System.out.println("Enter a number: ");
        number = input.nextInt();
        max = number;
        do { 
            number = input.nextInt();
            if ( number > max ) 
            { max = number ;
            }
        } while (number !=0);
        System.out.println("max is "+max+" and number "+number);
        
        
    }
    
}
