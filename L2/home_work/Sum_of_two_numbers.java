/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 8/8/24 11:44 PM
    WORKING       - sum of two numbers
*/

import java.util.Scanner;

public class Sum_of_two_numbers {
    public static void main(String[] args) {
        int number1, number2, sum;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the first number - ");
        number1 = obj.nextInt();
        System.out.print("Enter the second number - ");
        number2 = obj.nextInt();
        obj.close();

        sum = number1 + number2;
        System.out.println("The sum is - "+sum);
    }
}
