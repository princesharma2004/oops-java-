/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 9/8/24 7:29 AM
    WORKING       - days in weeks
*/

import java.util.Scanner;

public class Days_in_weeks {
    public static void main(String[] args) {
        int weeks, days;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of weeks - ");
        weeks = obj.nextInt();
        obj.close();

        days = 7 * weeks;
        System.out.print("The number of days is - "+days);
    }
}
