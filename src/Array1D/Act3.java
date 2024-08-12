package Array1D;
import java.util.Scanner;
public class Act3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char [] characters = new char [10];
        int size =0 ;
        int element = characters[0];
        char [] unique = new char [size];
        int counter = 0;
        
        for(int i =0 ; i < characters.length ; i++)
        {
         System.out.println("A ["+i+"]"+"= ");
         characters [i] = input.next().charAt(0);
        }
        for(int i = 0 ; i<characters.length ; i++)
        {
         for(int j = 0 ; j<characters.length; j++)
         {
          if(characters[i] == characters[j])
            counter = counter + 1 ;
         }
         System.out.println(characters[i]+"ocuurs"+counter+"times");
         counter = 0;
        }
    }
    
}