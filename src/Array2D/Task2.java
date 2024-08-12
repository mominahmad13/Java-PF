package Array2D;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int [][] array = new int[3][4];
        for( int i= 0 ; i< 3 ; i++)
        { System.out.println("Enter the Elements of row#"+(i+1));
          for(int j = 0; j<4;j++)
           { 
            array[i][j]= input.nextInt();
           }
         
        }
        System.out.println("The Orignal Array: ");
        for( int i= 0 ; i< 3 ; i++)
        { 
          for(int j = 0; j<4;j++)
           { 
               System.out.print(array[i][j]+"\t");
           }
            System.out.println();
        }
        
        int maxPrimerow=0;
        int maxPrime=0;
        for(int i = 0 ; i<3;i++)
        { 
           int n=0;
          for(int j = 0 ;j<4;j++)
          {  
              if(isPrime(array[i][j])==true)
            {
               n++;
            }
            
         }
           if( n> maxPrime)
            {
              maxPrime = n ;
              maxPrimerow= i;
            }
        }
         System.out.println("The Row with maximum Prime number: "+(maxPrimerow+1));
      
        int maxPrimecol=0;
        int MaxPrime=0;
        for(int i = 0 ; i<4;i++)
        { 
            int n=0;
          for(int j = 0 ;j<3;j++)
          {  
            if(isPrime(array[j][i])==true)
            {
               n++;
            }
           
           }
          
          if( n> MaxPrime)
            {
              MaxPrime = n ;
              maxPrimecol= i;
            }
        }
         
        System.out.println("The Column with maximum Prime number: "+(maxPrimecol+1));
    }
    public static boolean isPrime(int n) 
    { boolean isPrime=true;
      for(int i = 2 ; i<n/2 ;i++)
      {
        if(n%i == 0)
            isPrime = false;
      }
      return isPrime;
    }
    
}
