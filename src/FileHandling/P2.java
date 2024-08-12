package FileHandling;

import java.io.*;
import java.util.Scanner;

public class P2 {
     public static void main(String[] args)
    { 
      try
       {
           File file = new File("d:\\test.txt");
           Scanner input  = new Scanner(file);
         
           while(input.hasNext())
            {
               int rno = input.nextInt();
               String name = input.next();
               int marks = input.nextInt();
                System.out.println("rno: "+rno);
                System.out.println("Name"+name);
                System.out.println("Marks"+marks);             
           }
                 
       }
     
     catch(Exception e)
        {
            System.out.println(e.toString()); 
        }
          
          
    }
       
  }
    


