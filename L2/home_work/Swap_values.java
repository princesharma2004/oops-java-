/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 9/8/24 7:14 AM
    WORKING       - swap values
*/

import java.util.Scanner;

public class Swap_values {
    public static void main(String[] args) {
        int number1,number2;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the first number - ");
        number1 = obj.nextInt();
        System.out.print("Enter the second number - ");
        number2 = obj.nextInt();
        obj.close();

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("After swapping, first number is "+number1+" and second number is "+number2);
    }
}
