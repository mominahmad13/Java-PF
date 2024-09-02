package Assign3;
import java.util.*;

public class MenuDrivenProgram {
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        System.out.println("Enter size: ");
        int size = input.nextInt( );
        int [ ] arr = new int[size] ;

        for (int i = 0; i < arr.length ; i++)
        {
            System.out.println("Enter elements of array for index "+i);
            arr[i] = input.nextInt( );
        }
        int choice ;

        do
        {
            System.out.println("1: Count the occurrence of number in array");
            System.out.println("2; Partiton of numbers in array before and after arr[0");
            System.out.println("3: Frequency of all numbers in array");
            System.out.println("4; Circularly shift elements of array by next two indexes");
            System.out.println("5: CircularShift to indexes to two left");
            System.out.println("Enter your choice: ");
            choice = input.nextInt( );
            switch ( choice )
            {
                case 1:
                    System.out.println("Enter number :");
                    int num = input.nextInt( );
                    break;
                case 2:
                    System.out.println(Arrays.toString( partition(arr) ) ) ;
                    break ;
                case 3:
                    duplicate( arr ) ;
                    break ;
                case 4:
                    circular(arr);
                    break ;
                case 5:
                    shiftCircular( arr ) ;
                case 6 :
                    System.out.println("Exiting :) ");
                    break ;
                default:
                    System.out.println("Invalid choice");


            }
        } while( choice!= 6 ) ;

    }

    static void count ( int x  , int [ ] arr )
    {
        int count = 0 ;
        for (int i = 0; i < arr.length ; i++)
        {
            if ( arr[i] == x )
            {
                count ++ ;
            }
        }
        System.out.println(x+"occurs in"+count+" times in array");
    }

    static int [] partition (  int[] arr )
    {
        int [ ] temp = new int[arr.length] ;
        int x = arr[0] ;
        int i = 0 ;
        // entering values  less than x
        for (int j = 0; j < arr.length; j++)
        {
            if ( arr[j] < x )
            {
                temp[i] = arr[j] ;
                i ++ ;
            }
        }
            temp[i] = x ; // last value of i that is left after finishing of loop
            i++;  // incrementing after putting x in its desired location to go to next index
        for (int j = 0; j < arr.length  ; j++)
        {
            if ( arr[j] > x  )
            {
                temp[i] = arr[j] ; // temp array indexes are limited while in arr array we can search whole array
                // that's why we use j in it
            }
        }
          return temp ;
    }

    static void duplicate( int [ ] arr )
    {

        int frequency ;
        for (int i = 0; i < arr.length ; i++)
        {
             frequency = 0 ;
             boolean repeated = false ;

            for (int j = i-1 ; j >= 0 ; j--)
            {
                if( arr[j] == arr[i] )
                {
                    repeated = true; ;
                    break ;
                }
            }
// repeat varaible is created to check if a number in array is counted previously hence preventing loop to run multiple times
        if( repeated )
            continue ;
          //  frequency counter loop
        for (int j = 0 ; j < arr.length ; j++)
            {
                if ( arr[i] == arr[j] )
                {
                    frequency ++;
                }

            }

            System.out.println("freq of "+arr[i]+" in array: "+frequency+" times" );

        }
    }

    public static void circular ( int[ ] arr )
    {
        int [] circular = new int  [arr.length];
        for (int i = 0; i < arr.length ; i++)
        {
            circular[i] = arr[ ( i + 1 ) % arr.length ] +  arr[ ( i + 2 ) % arr.length ] ; // mod is used so that after approaching last index it does back to start following the circular pattern
        }
        System.out.println(Arrays.toString(circular));
    }

    public static void shiftCircular( int[ ] arr )
    {
        int [ ] shiftCircular = new int [ arr.length] ;
        int temp1 = arr[0] ;
        int temp2 = arr[1] ;

        for (int i = 0  ; i < arr.length - 2  ; i++)
        {
          shiftCircular[i] = arr[i+2] ;
        }

        shiftCircular[arr.length-2] = temp1;
        shiftCircular[arr.length - 1 ] = temp2 ;

        System.out.println(Arrays.toString(shiftCircular));
    }




}

