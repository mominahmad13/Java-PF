package Assign2;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        int vow = 0;
        for(int i =0; i<s.length(); i++)
            if (s.charAt(i)=='A'||s.charAt(i)=='a'||s.charAt(i)=='E'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='U')
                vow++;
        System.out.println("The number of vowels in the string: " + vow);

    }
  
}
