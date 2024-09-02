package FileHandling.Practice;
//import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader ;
import java.io.InputStreamReader;

public class P1 {
    public static void main(String[] args)
    {
//        try (InputStreamReader isr = new InputStreamReader(System.in))
//        {
//            System.out.println("Enter some letters: ");
//            int letter = isr.read(); // first read of character
//            while (isr.ready())
//             {               System.out.println((char) letter);
//               letter = isr.read( );
//
//             }
//          // isr.close(); // automatically close no need to write due to try and catch block
//              System.out.println();
//       } catch ( IOException ex )
//       {
//           System.out.println(ex.getMessage());
//       }

        try ( FileReader fr = new FileReader("resources/notes.txt") )
        {
            int letter ;  // .read method  return int type // read character and store
            while (( letter = fr.read() ) !=-1) // read each character until end of file
            {
                System.out.println((char) letter);

            }
             // fr.close(); // automatically close no need to write due to try and catch block
            System.out.println();
        } catch ( IOException ex )
        {
            System.out.println(ex.getMessage());
        }
         // InputStreamReader reads byte data and convert it into char
        // BufferReader reads char stream
        try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;)
        {
            System.out.println("You typed: "+br.readLine());
        }
        catch ( IOException ex )
        {
            System.out.println(ex.getMessage());
        }

        try ( BufferedReader br = new BufferedReader(new FileReader("resources/notes.txt")) ;)
        {
           while( br.ready())
           {
               System.out.println(br.readLine());
           }

        }
        catch ( IOException ex )
        {
            System.out.println(ex.getMessage());
        }
    }
}

