package Array2D;
import java.util.Scanner;
public class Act4 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int matrix [][] = new int[4][4];
        for(int i = 0 ; i<4 ; i++)
        {
            System.out.println("Enter Elements of row#"+(i+1));
         for(int j = 0 ; j<4 ; j++)
          matrix[i][j]= input.nextInt();
        }
        System.out.println("The Orignal Matrix is: ");
        for(int i = 0; i<4 ; i++)
        {
          for(int j =0 ; j<4 ; j++)
           System.out.print(matrix[i][j]+"\t");
          System.out.println();
        }
          int sum = 0 ;
         for(int i = 0 ; i<4 ; i++)
         {
          for(int j = 0 ; j<4 ; j++)
           {
            if(i == j)
            {
              sum+= matrix[i][j];
              break;
            }
           }
         }
         System.out.println("The sum of Diagonal is "+sum);
    }
       
   }  
    
    

