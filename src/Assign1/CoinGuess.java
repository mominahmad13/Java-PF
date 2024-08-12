package Assign1;
import java.util.Scanner;
public class CoinGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double randomValue = Math.random();
        int toss = (randomValue < 0.5) ? 0 : 1;
        System.out.println("Enter your Guess Value: heads (0) or tails (1):");
        int guess = input.nextInt();
        if (guess == toss) {
            System.out.print("Congratulations! You won. It's ");
        } else {
            System.out.print("Sorry, you lost. It's ");
        }

        System.out.println((toss == 0) ? "Heads." : "Tails.");
    }
}
