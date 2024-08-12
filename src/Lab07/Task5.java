package Lab07;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args)
    {
        Scanner  input = new Scanner ( System.in );
        System.out.print("Enter a String without space : ");
        String s = input.next();
        System.out.println("Total no of letters in String: "+countLetters(s));    
    }
    public static int countLetters(String s)
    {  int count = 0;
      for ( int i = 0 ; i < s.length(); i++)
      { if (Character.isLetter(s.charAt(i)))
            count++;
      }
         return count;   
    }
}

