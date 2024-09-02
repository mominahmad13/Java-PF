package Assign3;
import java.util.* ;
public class SortedArrayChecker
{
    public static void main(String[] args)
    {
          Scanner input =new Scanner(System.in);
           int [] arr = new int[10] ;

        for (int i = 0; i < arr.length ; i++)
        {
             System.out.println("Enter element of array for index "+i+":");
             int element =input.nextInt( ) ;
             arr[i] = element ;
        }
        if( isSorted(arr) )
        {
            System.out.println("array is sorted");
        }
        else
        {
            int [] sortArr = incSorted(arr);
            System.out.println("Sorted Array:"+ Arrays.toString(sortArr));
        }

    }

    public static boolean isSorted ( int [] list )
    {
        for ( int i = 0 ; i< list.length ; i++ )
        {
            for ( int j = i+1 ; j < list.length ; j++ )
            {
               if ( list[i] > list[j] )
                {
                    return false;
                }
            }
        }
                   return true ;
    }
    public static int[] incSorted ( int [ ] list )
    {
            int temp = 0 ;
        for ( int i = 0 ; i< list.length ; i++ )
        {
            for ( int j = i+1 ; j < list.length ; j++ )
             {
                if ( list[i] > list[j] )
                {
                    temp = list[i] ;
                    list[i] = list[j] ;
                    list[j] = temp ;

                }
             }
        }
                  return list ;
    }

}
