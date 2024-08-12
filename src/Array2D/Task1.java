
package Array2D;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[3][4];

        for (int i = 0; i < 3; i++) 
        {
            System.out.println("Enter the Elements of row #" + (i + 1));
            for (int j = 0; j < 4; j++)
            {
                array[i][j] = input.nextInt();
            }
        }

        System.out.println("The Original Matrix is: ");
        for (int i = 0; i < 3; i++) 
            
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Row having max Sum is row no: " + (maxRow(array) + 1));
        System.out.println("Column having max Sum is Col no: " + (maxCol(array) + 1));
    }

    public static int maxRow(int[][] array) {
        int maxSum = -1; 
        int maxRow = 0;
        for (int i = 0; i < 3; i++)
        {
            int rowSum = 0;
            for (int j = 0; j < 4; j++)
            {
                rowSum += array[i][j];
            }
            if (rowSum > maxSum) 
            {
                maxSum = rowSum;
                maxRow = i;
            }
        }
        return maxRow;
    }

    public static int maxCol(int[][] array) 
    {
        int maxSum = -1; 
        int maxCol = 0;
        for (int j = 0; j < 4; j++) 
        {
            int colSum = 0;
            for (int i = 0; i < 3; i++) 
            {
                colSum += array[i][j];
            }
            if (colSum > maxSum)
            {
                maxSum = colSum;
                maxCol = j;
            }
        }
        return maxCol;
    }
}
