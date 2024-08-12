package Lab07;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();
        System.out.println("Number of vowels in String: "+ countVowels(str));
        
    }
    public static int countVowels(String str)
    { int count = 0;
      str = str.toLowerCase();
      for (int i =0 ; i <str.length();i++)
      { char ch = str.charAt(i);
        if (ch=='a'||ch=='e'|| ch=='i'||ch=='o'||ch=='u')
            count++;
      }
       return count;
        
    }

}
