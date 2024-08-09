/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 9/8/24 12:37 PM
    WORKING       - sum of digits
*/

import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {
        int number, sum=0;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number - ");
        number = obj.nextInt();
        obj.close();

        while(number>0) {sum+=number%10; number/=10;}
        System.out.println("The sum of the digits is - "+sum);
    }
}
