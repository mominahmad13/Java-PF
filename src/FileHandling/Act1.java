package FileHandling;
import java.util.Scanner;
import java.io.*;
public class Act1 {
    public static void main(String[] args) 
    {
      try
        {
         char ch[] = {'j','a','v','a'};
         OutputStream os = new FileOutputStream("d:\\test1.txt");
         for(int i = 0 ;i<ch.length ;i++)
          {
           os.write(ch[i]);
          }
         os.close();
         InputStream is = new FileInputStream("d:\\text1.txt");
         int size = is.available();
         for( int i = 0 ; i<size ; i++)
         {
             System.out.println((char)is.read()+" ");
         }
         is.close();
         
        }
      catch(IOException e)
      {
          System.out.println("Exception");
      }
   }
    
}
