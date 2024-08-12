package Assign2;
public class Task5c {
    public static void main(String[] args) {
      for(int i=1; i<=6; i++)
        {
            for(int j=6; j>=i; j--)
                System.out.print(" " + " ");
            for(int j=i; j>=1; j--)
                System.out.print(j + " ");
            System.out.println();
        }

    }
    
}
