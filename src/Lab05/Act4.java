
package Lab05;
import java.util.*;
public class Act4 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        int guess;
        boolean done;
        num = (int) ((Math.random()*100));
        done = false;
        while (!done){
            System.out.println("Enter an integer greater"+"than or equal to 0 and "+"less than 100: ");
        guess =input.nextInt();
        System.out.println();
        if (guess == num)
        {System.out.println("you guessed the correct number");
           done = true;
        }
        else if (guess < num)
            System.out.println("Your guess is "+"lower than the number.\n"+"Guess Again");
        else
            System.out.println("Your guess is "+"higher than"+"the number.\n"+"Guess Again");
        }
    }
    
}
