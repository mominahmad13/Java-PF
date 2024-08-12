package Lab06;
import java.util.Scanner;
public class Task3b {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a hex value: ");
        char hexDigit = input.next().charAt(0);
        int decimalValue = 0;
        String binaryValue = "";
        String binary = "";
        int rem;
        if (hexDigit>='0' && hexDigit<='9')
            decimalValue= (int) hexDigit ;
        else if (hexDigit>='A' && hexDigit<='F')
            decimalValue = (hexDigit - 'A')+10;
        else if (hexDigit>='a' && hexDigit<='f')
            decimalValue = (hexDigit - 'a')+10 ;
        else
            System.out.println("Invalid input");
        while(true)
        {  
            rem = decimalValue % 2;
            decimalValue /= 2;
            binaryValue += rem+"" ;
            if (decimalValue == 0)
                break;
        }
        for (int i=binaryValue.length()-1; i>=0; i--)
            binary += binaryValue.charAt(i);
        System.out.println("The binary value is "+binary);
        
    }
    
}
