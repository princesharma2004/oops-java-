/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 8/8/24 11:38 PM
    WORKING       - find simple interest
*/

import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] arg)
    {
        int principal_ammount=1000, interest_rate=7, time=2;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter principal - ");
        principal_ammount = obj.nextInt();
        System.out.print("Enter rate of interest - ");
        interest_rate = obj.nextInt();
        System.out.print("Enter time (years) - ");
        time = obj.nextInt();
        obj.close();

        float simple_interest=(float) principal_ammount*interest_rate*time/100;
        System.out.println("The simple interest is - "+simple_interest);
    }
}
