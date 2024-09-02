package Assign3;
import java.util.*;

public class RandomSquareMatrix {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = input.nextInt();
        int [ ] [ ] square = new int [size] [size] ;

        generateMatrix(square);
        displayMatrix(square);

        int column = 0 ;
        int row = 0 ;

        for (int binary = 0; binary < 2 ; binary++)
        {
            for (int i = 0; i < square.length ; i++)
            {
               if (  rowSequence( square, binary , i ) )
                {
                    System.out.println("All "+ binary +" s on row "+i );
                    row++ ;
                }
            }
        }

        for (int binary = 0; binary < 2 ; binary++)
        {
            for (int j = 0; j < square.length ; j++)
            {
                if (  colSequence( square, binary , j ) )
                {
                    System.out.println("All"+ binary +"s on col "+j );
                    column ++ ;
                }
            }
        }

        if ( column == 0 )
        {
            System.out.println("No same number on any column ");
        }

        if( row == 0 )
        {
            System.out.println("No same number on any row ");
        }

        System.out.println("major diagonal 1's: "+ majorDiagonal(square,1));
        System.out.println("major diagonal 0's: "+ majorDiagonal(square,0));
        System.out.println("sub diagonal 1's: "+ subDiagonal(square,1));
        System.out.println("sub diagonal 0's: "+ subDiagonal(square,0));
        System.out.println("super diagonal 1's: "+ superDiagonal(square,1));
        System.out.println("super diagonal 0's: "+ superDiagonal(square,0));

    }

    public static int [ ] [ ] generateMatrix(int [] [] square)
    {

        for( int i = 0 ; i < square.length; i++ )
        {
            for (int j = 0; j < square[i].length ; j++)
            {
                square[i][j] = (int) ( Math.random( ) * 2 );
            }
        }
            return square ;
    }

    public static void displayMatrix ( int [ ] [ ] square )
    {

        for (int i = 0; i < square.length; i++)
        {
            for (int j = 0; j < square.length ; j++)
            {
                System.out.print(square[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean rowSequence ( int [ ] [ ] square , int binary , int row )
    {

        for ( int k = 0 ;  k < square.length ; k++ )
        {
            if ( square [row] [k] != binary ) return false ;
        }
            return true ;
    }

    public static boolean colSequence ( int [ ] [ ] square , int binary , int col )
    {

        for ( int k = 0 ;  k < square.length ; k++ )
        {
            if ( square [k] [col] != binary ) return false ;
        }
        return true ;
    }

    public static boolean majorDiagonal ( int [ ] [ ] square , int binary )
    {

        boolean primDiagonal = true ; // form top left to botton right

        for (int i = 0; i < square.length ; i++)
        {
           if( square[i][i] != binary )
           {
               primDiagonal = false ;
           }

        }

         boolean secondDiagonal = true ; // from top right to bottom left

         int k = 0 ;

        for (int i = square.length-1; i >= 0 ; i--)  // starting from botton left and then goes to top right
        {
            if ( square [i][k++] != binary  )
            {
                secondDiagonal = false ;
            }

        }

           return primDiagonal || secondDiagonal ;
    }

    public static boolean subDiagonal( int [ ] [ ] square , int binary )
    {
        // sub diagonal is just below primary diagonal
        //  j = i - 1
        //  'i' always start from  1st row
        for (int i = 1 ; i < square.length; i++)
        {
            if ( square[i][i-1] != binary ) return false ;

        }
            return true;
    }

    public static boolean superDiagonal( int [ ] [ ] square , int binary )
    {
        // super diagonal is just below primary diagonal
        //  j = i - 1
        //  'i' always start from  0th row
        for (int i = 0 ; i < square.length - 1 ; i++)
        {
            if ( square[i][i+1] != binary ) return false ;

        }
        return true;
    }

}
