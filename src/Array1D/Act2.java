package Array1D;
import java.util.Scanner;
public class Act2 {
    public static void main(String[] args) 
    {
     Scanner input = new Scanner(System.in);
     int array []  = new int [5] ;
     System.out.println("Enter arra elements....");
     for(int i = 0 ; i < array.length; i++)
     {
      array[i]=input.nextInt();
     }
     System.out.println("Sum of given array is: "+sum(array));
    }
    static int sum (int [] array)
     {
       int s = 0;
       for (int x : array)
           s+= x;
       return s ;
     }
}

 