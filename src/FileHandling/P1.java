package FileHandling;
import java.io.*;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args)
    { 
       Scanner input = new Scanner(System.in);
    try
     {
         FileOutputStream file = new FileOutputStream("d:\\test.txt",true);
//       File file = new File("d:\\test.txt");
       PrintStream ps = new PrintStream(file);
         
      while(true)
       {
           System.out.println("Enter roll no: "); 
           int rno = input.nextInt();
           if(rno ==0 )
            break;
           System.out.println("Enter name");
           String name = input.next();
           System.out.println("Enter marks");
           int marks = input.nextInt();
           ps.println(rno);
           ps.println(name);
           ps.println(marks);
           
       }
         System.out.println("Data is entered");      
     }
     
     catch(Exception e)
        {
            System.out.println(e.toString()); 
        }
          
          
    }
       
    }
    
