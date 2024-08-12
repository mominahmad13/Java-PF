package Array1D;
import java.util.Scanner;
public class Act4 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number to choose menu: ");
      System.out.println("1: For input and display array \n2: For searching Element in Array ");
      System.out.println("3: For largest and Smalest eleent in Array ");  
      System.out.println("4: For copy data on another Array");
      System.out.println();
      int a = input.nextInt();
      
      switch(a){
            case 1: {
                int[] a1 = new int[1];
                int[] array = (Input(a1));
                display(array);
                break;
            }
            case 2: {
                int[] a1 = new int[1];
                int[] array1 = (Input(a1));
                System.out.println(" Enter number for search:");
                int searchkey = input.nextInt();
                search(array1, searchkey);
                break;
            }
            case 3: {
                int[] a1 = new int[1];
                int[] array1 = (Input(a1));
                largest(array1);
                smallest(array1);
                break;
            }
            case 4: {
                int[] a1 = new int[1];
                int[] array1 = (Input(a1));
                int[] copied = new int[10];
                copydata(array1, copied);
                break;
            }
            default:
                System.out.println(" Invalid input");
        }
    }
      public static int[] Input(int[] Array)
    {
        int[] array1 = new int[10];
        Scanner input = new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.print(" A[" + i + "] =");
            array1[i] = input.nextInt();
        }
        return array1;
    }
    
    public static void display(int[] A){
        for (int j=0; j<10; j++)
            System.out.println(" A[" + j + "] " + A[j]);
    }
    
    public static void search(int[] array, int x){
        int flag = 0;
        while (flag==0){
            for (int j=0; j<10; j++){
                if(array[j]==x){
                    System.out.println(" Element Found A[" + j + "] " + array[j]);
                    flag++;
                }
            }
            if(flag==0){
                System.out.println(" Element Not Found");
                break;
            }
        }
    }
    
    public static void largest(int[] array){
        int k = array[0];
        for (int i=0; i<10; i++)
            if (array[i]>=k)
                k = array[i];
        System.out.println("LArgest value at A[0] " + k);
    }
    
    public static void smallest(int[] array){
        int k = array[9];
        for(int i=0; i<10; i++)
            if (k >= array[i])
                k = array[i];
        System.out.println("Smallest value at A[9] " + k);
    }
    
    public static void copydata(int[] array, int[] copied)
    {
        for (int j=0; j<10; j++)
         copied[j] = array[j];
        for (int k=0; k<10; k++)
         System.out.println(" New copied array is B[" + k + "] = " + copied[k]);
    }
    
}