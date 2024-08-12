package Lab04;
import java.util.*;
public class Act3 {
    static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        double wages , rate ,hours ;
        System.out.println("Entering the working hours: ");
        hours = input.nextDouble();
        System.out.println("Enter the pay rate: ");
        rate = input.nextDouble();
        System.out.println();
        if (hours > 40.0)
            wages = 40.0 * rate + 1.5 * (rate *(hours-40.0));
        else
            wages = hours * rate ;
        System.out.printf("The wages are $%.2f %n",wages);
        System.out.println();
    }
}
