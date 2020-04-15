import java.util.Scanner;
import java.util.Arrays;
public class DateFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a date in MM/DD/YYYY format");
        String date = input.nextLine();
        String[] date2 = date.split("/");
        String year = date2[2];
        String day = date2[1];
        String date3 = date2[0];
        String month_string = "";
        switch (date3) {
            case "1":
                month_string = "January";
                break;
            case "2":
                month_string = "February";
                break;
            case "3":
                month_string = "March";
                break;
            case "4":
                month_string = "April";
                break;
            case "5":
                month_string = "May";
                break;
            case "6":
                month_string = "June";
                break;
            case "7":
                month_string = "July";
                break;
            case "8":
                month_string = "August";
                break;
            case "9":
                month_string = "September";
                break;
            case "10":
                month_string = "October";
                break;
            case "11":
                month_string = "November";
                break;
            case "12":
                month_string = "December";
                break;
            default:
                System.out.println("Invalid Month");
                return;
        }
        System.out.println("It is " + month_string + " " + day + "," + " " + year);

    }
}
