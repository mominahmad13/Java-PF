package Lab07;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        System.out.println("Year "+year+" has "+numberOfDaysInAYear(year)+" no of days");
    }
    public static int numberOfDaysInAYear(int year)
    { 
      if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)  )
          return 366 ;
      else
          return 365 ;
    }
        
        
    }
    
