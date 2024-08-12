package Lab06;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.next();
        boolean isPalindrome = true ;
        int length = str.length();
        int left = 0;
        int right = length - 1;
        while (left < right)
        {  if (str.charAt(left) != str.charAt(right))
           { isPalindrome = false;
             break;
           } 
          left++;
          right--;
        }
        if (isPalindrome)
            System.out.println( str+" is  a palindrome ");
        else
             System.out.println( str+" is not a palindrome ");
            
    }
    
}
