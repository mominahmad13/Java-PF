package Lab06;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("input: ");
        String str = input.nextLine();
        int firstIndex = str.indexOf('h');
        int lastIndex = str.lastIndexOf('h');
        String result = "" ;
        String beforeH ;
        String afterH ;
        if (firstIndex !=-1 && lastIndex != -1)
        {   beforeH = str.substring(0,firstIndex+1);
            afterH = str.substring(lastIndex);
            result = beforeH + str.substring(firstIndex+1,lastIndex).replace('h','H')+ afterH ;
        }
        System.out.println("Output: "+result);
    }
    
}
