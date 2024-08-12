package Lab06;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = input.nextLine();
        int firstIndex = str.indexOf('f');
        int lastIndex = str.lastIndexOf('f');
        if (firstIndex!= -1)
        {System.out.println("f has appeard at first index: "+firstIndex);}
          if (firstIndex != lastIndex )
              System.out.println("f has appeard at last index: "+lastIndex);
    }
    
}
