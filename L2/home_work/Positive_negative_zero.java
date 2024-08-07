/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 7/8/24 00:21 PM
    WORKING       - Positive,negative or zero
*/

import java.util.Scanner;

public class Positive_negative_zero {
    public static void main(String[] args) {
        int number;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number - ");
        number = obj.nextInt();
        obj.close();

        if(number>0) System.out.println("The number is positive");
        else if(number<0) System.out.println("The number is negative");
        else System.out.println("The number is zero");
    }
}
