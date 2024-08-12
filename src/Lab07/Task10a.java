package Lab07;
import java.util.Scanner;
public class Task10a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        leftTriangle(n, 1);
        System.out.println();
        rightTriangle(n, n);
        System.out.println();
        pyramid(n, n);
        System.out.println();
        invertedTriangle(n,n);
    }
    public static void printn(int num){
        if (num==0)
            return;
        System.out.print("* ");
        printn(num-1);
    }
    public static void printSpace(int space){
        if (space==0)
            return;
        System.out.print(" ");
        printSpace(space-1);
    }
    public static void printSpaces(int space){
        if (space==0)
            return;
        System.out.print(" " + " ");
        printSpaces(space-1);
    }
    public static void leftTriangle(int n, int i){
        if (n==0)
            return;
        printn(i);
        System.out.println();
        leftTriangle(n-1, i+1);
    }
    public static void rightTriangle(int n, int num){
        if (n==0)
            return;
        printSpaces(n-1);
        printn(num - n+1);
        System.out.println();
        rightTriangle(n-1, num);
    }
    public static void pyramid(int n, int i){
        if (n==0)
            return;
        printSpace(n-1);
        printn(i - n+1);
        System.out.println();
        pyramid(n-1, i);
    }
    public static void invertedTriangle(int n, int i){
        if (n==0)
            return;
        printn(i);
        System.out.println();
        invertedTriangle(n-1, i-1);

    }
    
}
