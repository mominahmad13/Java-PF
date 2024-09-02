package Assign3;
import java.util.* ;
public class DistinctArray
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int [ ] arr = new int[10] ;
        int distinct = 0 ;

        System.out.print("Enter 10 number:");
        for ( int i = 0 ; i <arr.length ; i++)
        {
            boolean exist = false ;
            int number = input.nextInt( ) ;
            for( int j = 0 ; j<i ; j++)

            {
                if(  arr[j] == number )
                {
                    exist = true ;
                    break ;
                }
            }
               if(!exist )
               {
                   arr[i] = number ;
                   distinct ++ ;
               }
        }

        System.out.println("The number of distinct number is "+distinct);
        for (int i = 0; i < arr.length ; i++)
        {
            if ( arr[i] > 0)
            {
                System.out.print(arr[i] + " ");
            }
        }



    }

}
