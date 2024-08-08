/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 8/8/24 11:55 PM
    WORKING       - average of three numbers
*/

import java.util.Scanner;

public class Average_of_three_numbers {
    public static void main(String[] args) {
        int number1, number2, number3;
        float average;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the first number - ");
        number1 = obj.nextInt();
        System.out.print("Enter the second number - ");
        number2 = obj.nextInt();
        System.out.print("Enter the third number - ");
        number3 = obj.nextInt();
        obj.close();

        average = (float) (number1 + number2 + number3) / 3;
        System.out.print("The average is - "+average);
    }
}
