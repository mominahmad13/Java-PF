package Assign3;
import java.util.* ;
public class EliminateDup
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int [] arr = new int [10] ;
        System.out.print("Enter elements of array: ");
        for (int i = 0; i< arr.length; i++ )
        {
             int elements = input.nextInt();
             arr[i] = elements ;
        }
             int [] distinct = elimanateDuplicate( arr );
        for ( int i = 0; i < distinct.length; i++)
        {
           if ( distinct[i] > 0 )
           {
               System.out.print("The distinct elements are: "+ distinct[i] +" ");
           }
        }
    }

    public static int [] elimanateDuplicate(  int[ ] list )
    {
        int newarr [ ] = new int [10] ;
        boolean exit = false ;
        for( int i = 0 ; i < list.length ; i++ )
        {
           boolean exist = false ;
           for( int j = 0 ; j < i ; j++)
           {
               if ( list[i] == list [j] )
               {
                   exist = true ;
               }
           }
           if( !exist )
           {
               newarr [i] = list[i] ;
           }
        }
         return newarr;
    }
}
