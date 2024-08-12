package Array2D;
import java.util.Scanner;
public class Act2 {
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
     int [][]array = { {11,12,13},{14,15,16},{17,18,19},{20,21,22}};
     System.out.println("The Given 2D Array is...");
     for (int i = 0; i < 3; i++)
     {
         for (int j = 0; j < 3; j++) 
         {
             System.out.print(array[i][j]+"\t");
         }
         System.out.println();
     }
        
     System.out.println("The Prime no in 2D Array are:");
     int n = 0 ;
     for (int i = 0; i < 3; i++) 
     {
         for (int j = 0; j < 3; j++)
         {
          if (isPrime(array[i][j]) == true)
          {
            System.out.println(array[i][j]);
            n++;
          }
         }
     }
        System.out.println("Total Prime no:"+n);
    }
     static boolean isPrime(int n)
    {
     boolean prime = true ;
        for (int i = 2; i < n/2; i++) 
        {
          if(n%i==0)
          {
              prime = false;
              break;
          }
           
        }
       return prime;
     
    }
    
}
