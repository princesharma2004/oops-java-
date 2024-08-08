/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 8/8/24 11:17 PM
    WORKING       - Celsius to fahrenheit
*/

import java.util.Scanner;

public class Celsius_to_fahrenheit {
    public static void main(String[] args) {
        int celsius;
        float fahrenheit;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter temperature in celsius - ");
        celsius = obj.nextInt();
        obj.close();

        fahrenheit = celsius * (float) 9/5 + 32;
        System.out.println("The temperature in fahrenheit is - "+fahrenheit);
    }
}
