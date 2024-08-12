package Assign1;
import java.util.Scanner;
public class FutureDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter today's day (0 for Sunday, 1 for Monday, ..., 6 for Saturday):");
        int today = scanner.nextInt();
        System.out.println("Enter the number of days elapsed since today:");
        int futureDays = scanner.nextInt();
        int futureDay = (today + futureDays) % 7;
        String futureDayName = "";
        switch (futureDay) {
            case 0:
                futureDayName = "Sunday";
                break;
            case 1:
                futureDayName = "Monday";
                break;
            case 2:
                futureDayName = "Tuesday";
                break;
            case 3:
                futureDayName = "Wednesday";
                break;
            case 4:
                futureDayName = "Thursday";
                break;
            case 5:
                futureDayName = "Friday";
                break;
            case 6:
                futureDayName = "Saturday";
                break;
            default:
                System.out.println("Invalid Input");
        }

        System.out.println("The future day is " + futureDayName);
    }
}
