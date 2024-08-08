/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 8/8/24 00:01 AM
    WORKING       - square of a number
*/

import java.util.Scanner;

public class Square_of_a_number {
    public static void main(String[] args) {
        int number, square;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number - ");
        number = obj.nextInt();
        obj.close();

        square = number * number;
        System.out.println("The square of the number is - "+square);
    }
}
