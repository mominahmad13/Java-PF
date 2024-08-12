package Assign1;
public class RandomMonths {
    public static void main(String[] args) {
        int monthnumber = (int) ((Math.random()*12) +1 );
        String monthName = "";
        switch (monthnumber){
            case 1 :
                monthName = "January";
                break;
            case 2 :
                monthName = "February";
                break;
            case 3 :
                monthName = "March";
                break;
            case 4 :
                monthName = "April";
                break;
            case 5 :
                monthName = "May";
                break;
            case 6 :
                monthName = "June";
                break;
            case 7 :
                monthName = "July";
                break;
            case 8 :
                monthName = "August";
                break;
            case 9 :
                monthName = "September";
                break;
            case 10 :
                monthName = "October";
                break;
            case 11 :
                monthName = "November";
                break;
            case 12 :
                monthName = "December";
                break;
            default :
                System.out.println("Invalid month ");

        }
        System.out.println("Randomly generated month is: "+monthName);

    }
}
