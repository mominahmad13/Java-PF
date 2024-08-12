
package Lab05;
import java.util.Scanner;
public class Task1b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A : ");
        int A = input.nextInt();
        System.out.println("Enter B: ");
        int B = input.nextInt();
        if ( A < B ){
           for( int i = A ; i <=  B ;i++){
               System.out.println(i+" ");
           }
        }
        else
             for( int i = A; i >= B ; i--)
                 System.out.println(i+" ");
              
        }
   }
    
