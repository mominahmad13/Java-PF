package Practice;
import java.util.Scanner;
public class ThreeHighest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int max1 = 0 ;
        int max2 = 0 ;
        int max3 = 0 ;
        while(true)
        { System.out.print("Enter sequence of integers:");
           int num = input.nextInt();
           if (num > max1)
           { 
               max1 = num;
               continue;
           }
           if ( num < max1 && num > max2)
           {
               max2 = num;
               continue;
           }
           if( num < max1 && num < max2 && num > max3)
           {
               max3 = num;
               continue;
           }
          if(num<max1 && num < max2 && num< max3)
              continue;
           
          if(num == 0)
            break;
        }
        System.out.println("Three highest number in sequence are: "+max1+" "+max2+" "+max3);
    }
    
}
