/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 12/8/24 3:36 PM
    WORKING       - maximum between two numbers
*/

import java.util.Scanner;

public class Maximum_of_two_numbers {
    public static void main(String[] args) {
        int number1, number2;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the first number - ");
        number1 = obj.nextInt();
        System.out.print("Enter the second number - ");
        number2 = obj.nextInt();
        obj.close();

        if(number1>number2) System.out.println("The maximum number is - "+number1);
        else System.out.println("The maximum number is - "+number2);
    }
}
