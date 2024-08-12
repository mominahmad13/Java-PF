package Lab06;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a String: ");
        String str = input.nextLine();
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(str.length()-2));
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(0,str.length()-2));
        for (int i= 0; i<str.length();i+=2)
        { System.out.print(str.charAt(i));
        }
          System.out.println();
        for (int i = 1 ; i<str.length();i+=2) 
        { System.out.print(str.charAt(i));
        }
         System.out.println();
        for (int i = str.length()-1 ;i>=0;i--)
        { System.out.print(str.charAt(i));
           
        }
           System.out.println();
        for (int i = str.length()-1 ; i>=0 ; i-=2)
        { System.out.print(str.charAt(i));  
        }
           System.out.println();
          System.out.println(str.length());
        
        

    }

}
