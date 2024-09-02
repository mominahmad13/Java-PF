package FileHandling.Practice;

import java.net.URL;
import java.util.Scanner;
import java.net.MalformedURLException;
import java.io.IOException ;

public class ReadFileFromURL {
    public static void main(String[] args) {

        System.out.println("Enter URL: ");
        String urlString = new Scanner(System.in).next() ;

        try // URL cannot be used with try with resources because it is not autocloseable
        {
           URL url = new URL(urlString);
           int count = 0 ;
           Scanner input = new Scanner(url.openStream()) ;
           while ( input.hasNext())
           {
               String line = input.nextLine();
               count+= line.length();
           }
            System.out.println("The file size is "+ count+" characters");
        }

        catch ( MalformedURLException e)
        {
            System.out.println( "Invalid URL" ) ;
        }
        catch ( IOException e )
        {
            System.out.println("I/0 ERROR: "+e.getMessage());
        }

    }
}
