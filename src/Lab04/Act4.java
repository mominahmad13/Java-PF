package Lab04;
import java.util.*;
public class Act4 {
    static Scanner console = new Scanner (System.in);
    public static void main(String[] args) {
        int score ;
        System.out.println("Enter score: ");
        score = console.nextInt();
        if (score >= 90)
            System.out.println("The Grade is A");
        else if (score >= 80)
            System.out.println("The Grade is B");
        else if (score >= 70)
            System.out.println("The Grade is C");
        else if (score >= 60)
            System.out.println("The Grade is D");
        else
            System.out.println("The Grade is F");
    }
}
