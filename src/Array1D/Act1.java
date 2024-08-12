package Array1D;
import java.util.Scanner;
public class Act1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int [10];
        System.out.println("Enter arrays elements: ");
        for (int i = 0 ; i < array.length; i++)
        { 
            array[i] = input.nextInt();
        }
        int largest = array[0];
        for (int j : array) {
            if (largest < j) {
                largest = j;
            }
        }
        int largest2 ;
        if  ( array[0] == largest)
            largest2 = array[1];
        else
            largest2 = array[0];
        for (int j : array) {
            if (j != largest) {
                if (j > largest2)
                    largest2 = j;
            }

        }
        System.out.println("Largest number is:"+ largest);
        System.out.println("Second largest is: "+largest2);
         
    }
}
