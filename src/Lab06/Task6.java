package Lab06;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = input.nextLine();
        int spaceIndex = str.indexOf(' ');
        String firstWord = str.substring(0,spaceIndex);
        String secondWord = str.substring(spaceIndex+1);
        System.out.println("Words after swap: "+secondWord+firstWord);
    }
    
}
