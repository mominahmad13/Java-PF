package Assign2;
import java .util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Students: ");
        int numOfStudents = input.nextInt();
        int max = 0;
        String firstStudent = "";
        int score;
        String name;
        for (int i=1; i<=numOfStudents; i++)
        {
            System.out.print("Student Name: ");
            name = input.next();
            System.out.print("Score: ");
            score = input.nextInt();
            if (score>max)
            {
                max = score;
                firstStudent = name;
            }
        }
        System.out.println("The student with the highest score: " + firstStudent);
    }
    
}
