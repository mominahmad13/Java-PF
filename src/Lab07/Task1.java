package Lab07;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.print("Enter a integer: ");
       Scanner input = new Scanner(System.in);
       long number = input.nextLong();
        System.out.println("The sum of digits of number "+number+" is: "+sumDigits(number));
        System.out.print("Reverse output: ");
        reverse(number);
        System.out.println();
        
    }
    public static int sumDigits( long number)
    { int sum = 0 ;
      while(number!=0)
      { sum += number % 10;
        number/=10 ;
      }
      return sum;
    }
   public static void reverse( long number)
   {  while(number!=0)
    { int digit = (int) number % 10;
       System.out.print(digit);
       number /= 10;
    }
   }
}
