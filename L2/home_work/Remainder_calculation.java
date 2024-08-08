/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 8/8/24 00:09 PM
    WORKING       - remainder calculation
*/

import java.util.Scanner;

public class Remainder_calculation {
    public static void main(String[] args) {
        int dividend, divisor, remainder;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the dividend - ");
        dividend = obj.nextInt();
        System.out.print("Enter the divisor - ");
        divisor = obj.nextInt();
        obj.close();

        remainder = dividend % divisor;
        System.out.println("The remainder is - "+remainder);
    }    
}
