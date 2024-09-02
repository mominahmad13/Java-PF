package Assign3;
import java.util.* ;
public class SortStudentData
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      String [ ] names = new String [10] ;
      int [ ] rollNo = new int[10];
      int [ ] marks = new int [10];

      for( int i = 0 ; i < marks.length ; i++)
      {
           System.out.print("Enter name of student: ");
           names[i] = input.next();
           System.out.println("Enter roll no: ");
           rollNo[i] = input.nextInt( );
           System.out.println("Enter marks: ");
           marks[i] = input.nextInt();
      }

        SortData( marks , names , rollNo);


    }
    public static void SortData ( int[ ] marks , String [ ] names , int [ ] rollNo )
    {
        int temp = 0 ;
        String tempString ="";
        int tempRollno = 0 ;
        for (int i = 0; i < marks.length - 1; i++)
        {
            for (int j = i+1 ; j < marks.length ; j++)
            {
                if ( marks[i] <  marks [j] )
                {
                    temp = marks[i] ;
                    marks[i] = marks[j];
                    marks [j] = temp ;
                    tempString = names[i] ;
                    names[i] = names[j] ;
                    names[j] = tempString;
                    tempRollno = rollNo[i] ;
                    rollNo[i] = rollNo[j];
                    rollNo [j] = tempRollno;

                }
            }
        }
              System.out.println(Arrays.toString(names));
              System.out.println(Arrays.toString(marks));
              System.out.println(Arrays.toString(rollNo));
       }

}
