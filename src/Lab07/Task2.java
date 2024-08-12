package Lab07;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args)
    {   System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (isPalindrome(number))
            System.out.println("Given number is palindrome");
        else
            System.out.println("Given number is not palindrome ");
    }
    public static  int reverse( int number)
    {
        int rev = 0;
        while(number!=0)
        { rev = rev*10+ number%10;
           number /= 10;
        }
           return rev ;
    }
    public static boolean isPalindrome(int number)
    {  return number == reverse(number);
    }
      
   } 

