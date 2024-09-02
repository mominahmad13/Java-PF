package Assign3;
import java.util.* ;
public class fourConsecutive
{
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        int noOfValues = input.nextInt() ;
        int [ ] arr = new int[noOfValues];
        for (int i = 0; i < arr.length ; i++)
        {
            System.out.println("Enter element of array for index"+i+" ");
            int elements = input.nextInt();
            arr[i] = elements ;
        }
        if(isConsecutiveFour(arr))
        {
            System.out.println("The list has consecutive fours");
        }
        else
        {
            System.out.println("List doesn't has consecutive fours ");
        }


    }

    public static boolean isConsecutiveFour( int[] values  )
    {

        for (int i = 0; i < values.length ; i++)
        {
                int count = 0 ;
            for (int j = 1 ; j < 4 ; j++)
            {
                if ( (i+j) >= values.length )
                {
                    break ;
                }
                if ( values[i] == values[i+j] )
                {
                        count ++ ;
                }
                if ( count ==3 )
                {
                    return true ;
                }
            }
        }
                      return false ;
    }



}
