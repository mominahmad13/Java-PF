package FileHandling.Practice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException ;

public class ScannerReadClass {
    public static void main(String[] args) {

       File file = new File("resources/scores.txt" );
       try( Scanner input = new Scanner(file) )
       {
           while( input.hasNext())
           {
               String firstName = input.next() ;
               String mi = input.next( ) ;
               String lastName = input.next();
               int score = input.nextInt( );
               System.out.println( firstName + " "+ mi + " "+ lastName + " "+score);

           }

       }

       catch ( IOException ex )
       {
           System.out.println(ex.getMessage());
       }

    }
}
