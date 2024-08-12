package Lab04;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of first Rectangle: ");
        double length1 = input.nextDouble();
        System.out.println("Enter width of first Rectangle: ");
        double width1 = input.nextDouble();
        System.out.println("Enter length of second Rectangle: ");
        double length2 = input.nextDouble();
        System.out.println("Enter width of second Rectangle: ");
        double width2 = input.nextDouble();
        double area1 = length1 * width1 ;
        double area2 = length2 * width2 ;
        if (area1 == area2)
            System.out.println("Area of both rectangles are equal ");
        else if (area1>area2)
            System.out.println("Area of first rectangle is greater");
        else
            System.out.println("Area of second rectangle is greater");



    }
}
