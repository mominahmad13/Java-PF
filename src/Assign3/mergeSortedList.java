package Assign3;
import java.util.* ;
public class mergeSortedList
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements for list1: ");
        int values1= input.nextInt();
        System.out.print("Enter number of elements for list2: ");
        int values2= input.nextInt();
        int [ ] list1 = new int[values1];
        int [ ] list2 = new int[values2];
        int [] merged = new int [values1 + values2];
        for ( int i = 0 ; i < list1.length ; i++ )
        {
             System.out.println("Enter element of list1 for index"+i+" ");
             int element = input.nextInt( );
             list1[i] = element ;
        }

        for ( int i = 0 ; i < list2.length ; i++ )
        {
            System.out.println("Enter element of list2 for index"+i+" ");
            int element = input.nextInt( );
            list2[i] = element ;
        }

        for ( int i = 0 ; i < list1.length ; i++ )
        {
            merged[i] = list1[i] ;
        }

        for ( int i = 0 ; i < list2.length ; i++ )
        {
            merged[list1.length + i] = list2[i] ;
        }
        System.out.println("The merge list is ");
         merged = increasingSort(merged);
        for ( int i = 0 ; i < merged.length ; i++)
        {
            System.out.print(merged[i]+ " ");

        }


    }

    public static int [] increasingSort ( int [] merged )
    {
        int temp = 0 ;
        for( int i = 0 ; i < merged.length ; i++ )
        {
            for( int j = i+1 ; j < merged.length ; j++ )
            {
                if ( merged[i] > merged [j] )
                {
                    temp = merged[i] ;
                    merged[i] = merged[j] ;
                    merged[j] = temp ;
                }
            }
        }
                   return merged ;
    }


}
