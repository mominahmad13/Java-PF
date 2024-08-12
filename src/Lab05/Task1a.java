package Lab05;
import java.util.Scanner;
public class Task1a {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
         System.out.println("Enter two numbers A and B such that A <= B ");
         System.out.println("Enter A: ");   
        int A =input.nextInt();
        System.out.println("Enter B: ");
        int B = input.nextInt();
        while (true) 
        {
        if ( A <=B) 
            break;
        else
            System.out.println("A should be smaller and equal to B \nEnter again: ");            
        }   
        for (int i = A; i <=B ; i++ ) { 
            System.out.println(i+" ");
        }
                
        
    }
    
}
