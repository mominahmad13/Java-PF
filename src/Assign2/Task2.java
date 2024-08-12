package Assign2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Students: ");
        int numOfStudents = input.nextInt();
        int max = 0;
        int secondMax = 0;
        String firstStudent = "";
        String secStudent = "";
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
                secondMax = max;
                secStudent = firstStudent;
                max = score;
                firstStudent = name;
            }
            else if(score>secondMax)
            {
                secondMax = score;
                secStudent = name;
            }
        }
        System.out.println("The student with the highest score: " + firstStudent);
        System.out.println("The student with the second highest score: " + secStudent);

    }
    
    
}
