package LoopsPattern;
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a integer: ");
        int n = input.nextInt();
        for (int i = 1 ; i<=n ; i++ )
        {
          for (int j = 1 ; j<=n ; j++)
          {
            System.out.print("* ");
            //System.out.print(i+" "); ---> for numbers pattern
          }
            System.out.println();
            
        }
        
        
   } 
 }
