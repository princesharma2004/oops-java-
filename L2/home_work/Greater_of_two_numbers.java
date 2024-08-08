/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 8/8/24 11:50 PM
    WORKING       - greater of two numbers
*/

import java.util.Scanner;

public class Greater_of_two_numbers {
    public static void main(String[] args) {
        int number1, number2;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the first number - ");
        number1 = obj.nextInt();
        System.out.print("Enter the second number - ");
        number2 = obj.nextInt();
        obj.close();

        if(number1>number2) System.out.println("The greater number is - "+number1);
        else if(number2>number1) System.out.println("The greater number is - "+number2);
        else System.out.println("both are equal");
    }
}
