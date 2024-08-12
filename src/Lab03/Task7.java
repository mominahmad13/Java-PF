
package Lab03;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        final int ClassA = 20 ;
        final int ClassB =  15;
        final int ClassC = 10 ;
        final int ClassD = 5 ;
        System.out.println("Enter number of tickets for ClassA: ");
        int ticketA = input.nextInt();
        System.out.println("Enter number of tickets for ClassB: ");
        int ticketB = input.nextInt();
        System.out.println("Enter number of tickets for ClassC: ");
        int ticketC = input.nextInt();
        System.out.println("Enter number of tickets for ClassD: ");
        int ticketD = input.nextInt();
       
        int incomeA = ticketA * ClassA ;
        int incomeB = ticketB * ClassB ;
        int incomeC = ticketC * ClassC ;
        int incomeD = ticketD * ClassD ;
                
        int totalincome = incomeA + incomeB +incomeC + incomeD ;       
        System.out.println("Total income generated is: "+totalincome+"$");
        System.out.println("ClassA: "+incomeA+"$");
        System.out.println("ClassB: "+incomeB+"$");
        System.out.println("ClassC: "+incomeC+"$");
        System.out.println("ClassD: "+incomeD+"$");
    }
}
