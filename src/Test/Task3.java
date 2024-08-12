
package Test;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int list1[] = new int[10];
        for (int i = 0; i < list1.length; i++) {
            System.out.println("Enter List1 Element.no:" + i);
            list1[i] = input.nextInt();
        }

        int list2[] = new int[10];
        for (int i = 0; i < list2.length; i++) {
            System.out.println("Enter List2 Element.no:" + i);
            list2[i] = input.nextInt();
        }

        int list3[] = new int[10]; 
        
        list3 = evenOdd(list1, list2, list3);
       
        System.out.println("Resulted array: " + Arrays.toString(list3));
    }

    public static int[] evenOdd(int list1[], int list2[], int list3[]) {
        for (int i = 0; i < list1.length; i++) {
            if (i % 2 == 0) {
                list3[i] = list2[i]; 
            } else {
                list3[i] = list1[i]; 
            }
        }
        return list3;
    }
}
