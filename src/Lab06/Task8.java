package Lab06;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Input: ");
        String str = input.nextLine();
        String beforeH ;
        String afterH ;
        String result = "" ;
        int firstIndex = str.indexOf('h');
        int lastIndex = str.lastIndexOf('h');
        if (firstIndex !=-1 && lastIndex !=-1 )
        {  beforeH = str.substring(0,firstIndex);
           afterH = str.substring(lastIndex + 1);
           result = beforeH + afterH ;
        }
        System.out.println("correct answer: "+result);

        
    }
    
}
