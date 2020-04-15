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
        int daysInt = Integer.parseInt(day);
        int yearInt = Integer.parseInt(year);
        int monthInt = Integer.parseInt(date3);
        int numDays = 0;
        switch (monthInt) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                if (daysInt>numDays) {
                    System.out.println("Invalid Day");
                    return;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                if (daysInt>numDays) {
                    System.out.println("Invalid Day");
                    return;
                }
                break;
            case 2:
                if (((yearInt % 4 == 0) && !(yearInt % 100 == 0)) || (yearInt % 400 == 0)) {
                    numDays = 29;
                    if (daysInt > numDays) {
                        System.out.println("Invalid Day");
                        return;
                    }
                }
                else {
                    numDays = 28;
                    if (daysInt > numDays) {
                        System.out.println("Invalid Day");
                        return;
                    }
                }
                break;
            default:
                System.out.println("Invalid Month");
                return;
        }
            switch (monthInt) {
                case 1:
                    month_string = "January";
                    break;
                case 2:
                    month_string = "February";
                    break;
                case 3:
                    month_string = "March";
                    break;
                case 4:
                    month_string = "April";
                    break;
                case 5:
                    month_string = "May";
                    break;
                case 6:
                    month_string = "June";
                    break;
                case 7:
                    month_string = "July";
                    break;
                case 8:
                    month_string = "August";
                    break;
                case 9:
                    month_string = "September";
                    break;
                case 10:
                    month_string = "October";
                    break;
                case 11:
                    month_string = "November";
                    break;
                case 12:
                    month_string = "December";
                    break;
                default:
                    System.out.println("Invalid Month");
                    return;
            }
            System.out.println("It is " + month_string + " " + day + "," + " " + year);

        }
    }

