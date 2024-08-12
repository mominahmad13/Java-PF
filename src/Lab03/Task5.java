
package Lab03;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the no of liters of milk produced in morning: ");
        double  milk = input.nextDouble();
        int cartons = (int) Math.ceil(milk / 3.78 );
        double  cost  =  milk * 0.38 ;
        double profit  = cartons * 0.27 ;
        System.out.println("Number of Cartoons needed: "+cartons);
        System.out.println("Cost: "+cost+"$");
        System.out.println("Profit: "+profit+"$");
        
    }
}
