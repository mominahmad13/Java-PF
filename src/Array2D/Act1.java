package Array2D;
import java.util.Scanner;
public class Act1 {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       int [][] array  = new int[3][4];
        for (int i = 0; i < 3; i++)
        {
           System.out.println("Enter array element of row #"+(i+1));  
          for (int j = 0; j < 4; j++)
             {
                array[i][j]= input.nextInt();
             }
            
        }                                                                                   
        System.out.println("The Given 2D Array is...");
        for (int i = 0; i < 3 ; i++) 
        {
           for (int j = 0; j < 4; j++) 
             {
                System.out.print(array[i][j]+"\t");
             }
            System.out.println();   
        }
        int sum ; 
        for (int i = 0; i < 3; i++)
        {  
          sum = 0 ;
          for (int j = 0; j < 4; j++)
           {
             sum +=array[i][j];   
             
           }
          System.out.println("sum of row "+(i+1)+" is "+sum);
        }
    }
    
}
