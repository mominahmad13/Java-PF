package Array2D;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int [][] matrix1 = new int[3][4];
        int [][] matrix2 = new int[4][3];
        int [][] product = new int [3][3];
        for (int i = 0 ; i<3 ; i++)
        { 
          System.out.println("Enter the Elements for matrix1 for row#"+(i+1));
         for(int j = 0 ; j<4 ; j++)
         {
           matrix1[i][j] = input.nextInt();    
         }
        }
        
        System.out.println("The First Matrix is: ");
        for (int i = 0 ; i<3 ; i++)
        { 
          for(int j = 0 ; j < 4 ; j++)
            System.out.print(matrix1[i][j]+"\t"); 
          System.out.println();
        }
        
        for (int i = 0 ; i<4 ; i++)
        { 
          System.out.println("Enter the Elements for matrix2 for row#"+(i+1));
         for(int j = 0 ; j<3 ; j++)
         {
           matrix2[i][j] = input.nextInt();    
         }
        }
        
        System.out.println("The Second Matrix is: ");
        for (int i = 0 ; i<4 ; i++)
        { 
          for(int j = 0 ; j < 3 ; j++)
            System.out.print(matrix2[i][j]+"\t"); 
          System.out.println();
        }
         
        System.out.println("The product of two matrix is: ");
        matrixMultiplication(matrix1,matrix2,product);
        
        
    }
    
    public static void matrixMultiplication (int[][] matrix1 , int[][] matrix2, int[][] product)
    {
       for ( int i = 0 ; i < 3 ; i++)
       {
         for(int j =0 ; j< 3 ; j++)
         { 
           for (int k = 0; k < 4; k++)
           {
              product [i][j]  +=  matrix1[i][k] * matrix2 [k][j];   
            }
            
         }
       }
       for (int i = 0 ; i<3 ; i++)
        { 
          for(int j = 0 ; j < 3 ; j++)
            System.out.print(product[i][j]+"\t"); 
          System.out.println();
        }
    }
    
}
