package FileHandling.Practice;
import java.io.IOException;
import java.io.File ;
import java.io.PrintWriter;
public class PrintWriterClass
{
    public static void main(String[] args)
    {
        File file = new File("resources/writer.txt") ;
        if ( file.exists( ))
        {
            System.out.println("File already present");
            System.exit(1); // '1' is used to shut program and give warning
        }


        try( PrintWriter ps = new PrintWriter( file ) )
        {
            ps.print("Momin Ahmad T Uzair Sabir ");
            ps.println(90);
            ps.print("Eric K Jones ");
            ps.println(85);
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
