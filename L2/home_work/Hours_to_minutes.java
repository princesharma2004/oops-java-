/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 9/8/24 7:06 AM
    WORKING       - hours to minutes
*/

import java.util.Scanner;

public class Hours_to_minutes {
    public static void main(String[] args) {
        int hours, minutes;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter time in hours - ");
        hours = obj.nextInt();
        obj.close();

        minutes = hours * 60;
        System.out.println("The time in minutes is - "+minutes);
    }
}
