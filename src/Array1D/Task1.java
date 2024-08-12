package Array1D;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] rating = new int[40];
        for(int i = 0 ; i <rating.length;i++)
        {
         do{
            System.out.print("Student "+(i+1)+" response: ");
            rating[i] = input.nextInt();
        }while(rating[i]>10 || rating[i]>10);
        }
        int max = 0;
        int min = 0 ;
        int bad = 0 ;
        int good = 0;
        int sum = 0 ;
        for(int i = 0 ; i < rating.length ; i++)
        {
         if (rating[i]>5)
         good++;
         else
             bad++;
         if(rating[i]==10)
             max++;
         if(rating[i]==1)
             min++;
         sum += rating[i];
        }
        int avg = sum/40 ;
        System.out.println("Average rating of cafeteria is: "+avg);   
        System.out.println("Out of 40 students "+good+" rate it above5 with "+max+" rating it to 10");
        System.out.println("Out of 40 students "+bad+" rate it below 5  with "+min+" rating it to 1");
   }
    
}
