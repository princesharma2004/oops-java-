/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 7/8/24 11:58 PM
    WORKING       - Age in Dog Years
*/

import java.util.Scanner;

public class Dog_year {
    public static void main(String[] args) {
        int humman_age,dog_years;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your age - ");
        humman_age = obj.nextInt();
        obj.close();

        dog_years = humman_age * 7;
        System.out.println("Your age in dog years is - "+dog_years);
    }
}
