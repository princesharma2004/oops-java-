/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 9/8/24 01:11 PM
    WORKING       - leap year check
*/

import java.util.Scanner;

public class Leap_year_check {
    public static void main(String[] args) {
        int year;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a year - ");
        year = obj.nextInt();
        obj.close();

        if(year%4==0 && (year%100!=0 || year%400==0)) System.out.println("The year is a leap year");
        else System.out.println("The year is not a leap year");
    }
}
