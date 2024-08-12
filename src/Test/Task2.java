
package Test;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter cordinates: ");
        System.out.println("x1:");
        double x1 = input.nextDouble();
        System.out.println("x2:");
        double x2 = input.nextDouble();
        System.out.println("y1:");
        double y1 = input.nextDouble();
        System.out.println("y2:");
        double y2 = input.nextDouble();
        System.out.println("z1:");
        double z1 = input.nextDouble();
        System.out.println("z2:");
        double z2 = input.nextDouble();  
        calculateDistance(x1,y1,x2,y2);
        calculateDistance(x1,y1,x2,y2,z1,z2);
        
    }
    public static void calculateDistance (double x1,double y1,double x2,double y2)
    {
     double d = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
     System.out.println("Distance in 2D space is:"+d);
    
    }
    public static void calculateDistance (double x1,double y1,double x2,double y2,double z1,double z2)
    {
     double d = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2)+Math.pow((z1-z2),2));
     System.out.println("Distance in 2D space is:"+d);
    
    }
    
    
}