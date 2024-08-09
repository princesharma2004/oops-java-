/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 9/8/24 12:31 PM
    WORKING       - kilometers to miles
*/

import java.util.Scanner;

public class Kilometers_to_miles {
    public static void main(String[] args) {
        int kilometers;
        float miles;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter distance in kilometers - ");
        kilometers = obj.nextInt();
        obj.close();

        miles = (float) 0.621371 * kilometers;
        System.out.println("The distance in miles is  - "+miles);
    }
}
