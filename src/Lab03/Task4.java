
package Lab03;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the no of minutes: ");
        int N = input.nextInt();
        int hours =  N/60 ;
        int minutes = N % 60 ;
        System.out.println("The time on clock is: "+hours+":"+minutes);
    }
}
