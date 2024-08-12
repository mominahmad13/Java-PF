
package Lab03;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total number of Students: ");
        int Students = input.nextInt();
        System.out.println("Enter total no of Apples: ");
        int apple = input.nextInt();
        int givApple = apple / Students ;
        int remApple = apple % Students ;
        System.out.println("Apple to each Student: "+givApple);
        System.out.println("Remaining Apples: "+remApple);
    }
    
    
}
