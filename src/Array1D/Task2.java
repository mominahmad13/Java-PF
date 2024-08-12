package Array1D;
import java.util.Arrays;
public class Task2 {
    public static void main(String[] args) 
     {
       int[] array = {2, 3, 4, 6, 7, 8, 9, 12, 11, 5};
       int[] modified = modify(array);
       System.out.println(Arrays.toString(modified));
      
    }

    public static int[] modify(int[] array) 
    {
     for(int i=0; i<10; i++)
     {
      int m = array[i]*3;
      array[i] = m;
      
     }
      return array;
    }
}