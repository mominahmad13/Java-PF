package Lab03;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter your pay rate per hour: ");
        double payrate = input.nextDouble();
        System.out.println("Enter number of hours worked each week: ");
        int hours = input.nextInt();
        double incomeBefore = payrate * hours * 5;
        double taxamount = incomeBefore * 0.14;
        double incomeAfter = incomeBefore - taxamount;
        double clothes = incomeAfter * 0.1;
        double school = incomeAfter * 0.01;
        double rem = incomeAfter - (clothes + school);
        double bonds = rem * 0.25;
        double parentsBonds = bonds * 0.5;
        System.out.println("Income before taxes: " + incomeBefore + "$");
        System.out.println("Income after taxes: " + incomeAfter + "$");
        System.out.println("Amount to buy Clothes and other Accessories: " + clothes + "$");
        System.out.println("Amount spent on school supplies: " + school + "$");
        System.out.println("Amount spent on saving bond by you: " + bonds + "$");
        System.out.println("Amount spent on saving bonds by parents: " + parentsBonds + "$");
        
        
        
        
    }
   
   
}
