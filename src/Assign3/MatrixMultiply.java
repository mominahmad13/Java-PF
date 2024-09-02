package Assign3;
import java.util.*;

public class MatrixMultiply {
    public static void main(String[] args)
    {

        Scanner input =new Scanner(System.in);
        System.out.print("Enter row1: ");
        int r1 = input.nextInt();
        System.out.print("Enter col1: ");
        int c1 = input.nextInt( ) ;
        System.out.print("Enter row2:  ");
        int r2 = input.nextInt();
        System.out.print("Enter col2: ");
        int c2 = input.nextInt( );
        int [ ] [ ] matrix1 = new int [r1] [c1] ;
        int [ ] [ ] matrix2 = new int [r2] [c2] ;

        while ( true )
        {
          if( c1 == r2 )
          {
              break ;
          }

          else
          {
              System.out.print("Enter row1: ");
              r1 = input.nextInt();
              System.out.print("Enter col1: ");
              c1 = input.nextInt( ) ;
              System.out.print("Enter row2:  ");
              r2 = input.nextInt();
              System.out.print("Enter col2: ");
              c2 = input.nextInt( );
          }
        }

        // input for matrix1
        for ( int i =0 ; i < matrix1.length ; i++ )
        {
            for ( int j = 0 ; j < matrix1[i].length ; j++)
            {
                System.out.println("Enter element of "+i+"th row"+j+"th col :");
                matrix1[i][j] = input.nextInt();
            }
        }

        // input for matrix2
        for ( int i = 0 ; i < matrix2.length ; i++ )
        {
            for ( int j = 0 ; j < matrix2[i].length ; j++)
            {
                System.out.println("Enter element of "+i+"th row"+j+"th col :");
                matrix2[i][j] = input.nextInt();
            }
        }

        int  [ ] [ ] result = new int [ r1] [ c2 ] ;

        System.out.println( Arrays.deepToString( MatrixMultiplicationb( matrix1 , matrix2 , result ) ));


    }

    public static int [ ] [ ] MatrixMultiplicationb ( int [ ] [ ] matrix1, int [ ] [ ] matrix2 , int [ ] [ ] result )
    {
        // product of matrix1 & matrix2
        for ( int i =0 ; i < result.length ; i++ )
        {
            for ( int j = 0 ; j < result[i].length ; j++)
            {
                for ( int k = 0 ; k < matrix1[0].length; k++)
                {
                    result [i][j] += matrix1 [i][k] * matrix2 [k][j] ;
                }

            }
        }
                   return result ;

    }

}
