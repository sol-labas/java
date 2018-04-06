package conditions;

import java.util.Scanner;

/**
 *
 * @author angela
 */
public class Months2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int num = in.nextInt();
        System.out.println("Enter the year: ");
        int year = in.nextInt();
        
        int numDays = 0;
        switch (num) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
    }
}
