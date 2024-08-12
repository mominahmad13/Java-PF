
package Lab03;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students in first class: ");
        int a =input.nextInt();
        System.out.println("Enter number of students in second class:");
        int b = input.nextInt();
        System.out.println("Enter number of students in third class: ");
        int c = input.nextInt();
        int desk1 = a / 2 + a % 2;
        int desk2 = b / 2 + b % 2;
        int desk3 = c / 2 + c % 2;
        int totalDesk = desk1 + desk2 + desk3;
        System.out.println("The Smallest no of desk to be purchased: "+totalDesk);
         
    }
    
}
