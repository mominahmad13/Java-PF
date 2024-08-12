package Assign2;
public class Task7 {
    public static void main(String[] args) {
        int n = 1;
        int sum;
        System.out.print("The 4 perfect numbers are: ");
        while(n<10000)
        {
            sum = 0;
            for(int i=1; i<=n/2;i++)
                if (n%i==0)
                    sum+=i;
            if (n==sum)
                System.out.print(n + " ");
            n++;
        }
        System.out.println();

    }
    
}
