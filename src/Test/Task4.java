package Test;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of Arrays");
        int noOfArrays = input.nextInt();
        int [][] ragged = new int [noOfArrays][];
        int row = 0 ;
        int col = 0 ;
        for (int i = 0 ; i<ragged.length ; i++)
        {
          System.out.println("Enter size of array ");
           for (int j = 0 ; j<ragged[i].length ; j++)
           {
             System.out.println("Enter size of array: "+(i+1)+" :");
             int sizeOfArray =input.nextInt();
             ragged[i] = new int[sizeOfArray];
           }
        }
        for (int i = 0 ; i<ragged.length ; i++)
        {
          System.out.println("Enter element for"+(i+1)+"th row: ");
           for (int j = 0 ; j<ragged[i].length ; j++)
           {
             ragged[i][j] = input.nextInt();
           }
        }
        System.out.println("Enter a number to be searched: ");
        int number = input.nextInt();
        if (Search(ragged,number,row,col)==true)
          System.out.println("your Number is present row: "+row+" col:"+col);
    }
    public static boolean Search (int [][] ragged,int number ,int row ,int col)
    {  
     boolean  available = false ;
     for (int i = 0 ; i<ragged.length ; i++)
        {
           for (int j = 0 ; j<ragged[i].length ; j++)
           {
             if ( ragged[i][j] == number)
             { available = true;
               row = i ;
               col = j ;
             }
           }
        }
       return available;
    }
}
