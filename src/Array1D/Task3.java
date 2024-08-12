package Array1D;
import java.util.Arrays;
public class Task3 {
   public static void main(String[] args) {
       
     int[] array = {3, 4, 23, 4, 5, 78, 6, 21, 8, 91, 13};
     
     for(int i=0; i<=(array.length-1)/2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
       System.out.println(Arrays.toString(array));
       
    }


}
