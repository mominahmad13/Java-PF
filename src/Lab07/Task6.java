package Lab07;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        System.out.print("Enter a series of words: ");
        String sentence = input.nextLine();
        System.out.println("The capitalized word: " + capitalize(word));
        System.out.println("Thr capitalized series of words: " + capitalize(sentence));
    }
    public static String capitalize(String s)
    {
        String newWord = "";
        newWord += s.charAt(0);
        newWord = newWord.toUpperCase();
        for (int i=1; i<s.length(); i++)
        {
            if (s.charAt(i-1)== ' ')
            {
                newWord += Character.toUpperCase(s.charAt(i));
            }
            else
                newWord += s.charAt(i);
        }
        return newWord;

    }
}
