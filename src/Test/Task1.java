package Test;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalRetail = 0 ;
        double product1 = 2.98;
        double product2 = 4.50;
        double product3 = 9.98;
        double product4 = 4.49;
        double product5 = 6.87;
        
        while(true)
        {
            System.out.println(" Enter Product Number:");
            int n = input.nextInt();
            System.out.println("Enter quantity: ");
            int q = input.nextInt();
            if (n == -99)
                break;
            double price = 0;
            switch(n)
            {
              case 1:
              price = product1*q;
              break;
              case 2:
              price = product2*q;
              break;
              case 3:
              price = product3*q;
              break;
              case 4:
              price = product4*q;
              break;
              case 5:
              price = product5*q;
              break;
                   
            }
            totalRetail += price;
        }
        System.out.println("Total retail value:"+totalRetail);
    }
    
}
