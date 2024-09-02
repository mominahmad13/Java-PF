package FileHandling.Practice;

import java.io.File;
import java.util.Scanner ;
import java.io.IOException;


public class JavaBookFound {
    public static void main(String[] args)
    {
        File file = new File("resources/books.txt");
        String bookArray[ ] = new String[9];
        int bookCount = 0 ;
        try ( Scanner input = new Scanner(file) )
        {
           while( input.hasNextLine( ) )
           {
             bookArray[bookCount] = input.nextLine();
             bookCount ++ ;
           }

            int JavaBookCount= 0 ;

            System.out.println("Books related to java : ");

            for (int i = 0; i < 9 ; i++)
            {
               if( bookArray[i].toLowerCase().contains("java") )
               {
                   System.out.println(bookArray[i]);
                   JavaBookCount ++ ;
               }
            }
            System.out.println("Total no of books related to java: "+JavaBookCount);
        }

        catch(IOException e)
        {
            System.out.println("I/O Error occured "+e.getMessage());
        }
    }
}
