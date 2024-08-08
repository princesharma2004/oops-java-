/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 8/8/24 11:32 PM
    WORKING       - Evan or odd
*/

import java.util.Scanner;

public class Evan_or_odd {
    public static void main(String[] arg)
    {
        int number;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number - ");
        number = obj.nextInt();
        obj.close();

        if(number%2==1) System.out.println("The number is odd");
        else System.out.println("The number is even");
    }
}
