package Assign1;
import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Welcome to Quadratic Equation root Calculator! ");
                System.out.println("Enter co-efficient of x^2: ");
                double a = input.nextDouble();
                System.out.println("Enter a co-efficient of x: ");
                double b = input.nextDouble();
                System.out.println("Enter the constant's value: ");
                double c = input.nextDouble();
                double disc = Math.pow(b, 2) - 4 * a * c;
                if (disc > 0) {
                    double r1 = (-b + Math.sqrt(disc)) / (2 * a);
                    double r2 = (-b - Math.sqrt(disc)) / (2 * a);
                    System.out.println("The equations has two roots: " + r1 + " " + r2);
                } else if (disc == 0) {
                    double r1 = -b / (2 * a);
                    System.out.println("The equation has one root: " + r1);
                } else {
                    System.out.println("Equation does not have real roots");
                }
            }
        }

//        if (disc > 0)
//            System.out.println("The equations has two roots: "+r1+" "+r2);
//        if (disc == 0)
//            System.out.println("The equation has one root: "+r1);
//        else
//            System.out.println("Equation does not have real roots");















