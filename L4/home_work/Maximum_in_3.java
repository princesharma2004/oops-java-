/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 12/8/24 11:03 PM
    WORKING       - Maximum in three variable
*/

import java.util.Scanner;

public class Maximum_in_3 {
    public static void main(String[] arg)
    {
        int number1,number2,number3,maximum;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the first number - ");
        number1 = obj.nextInt();
        System.out.print("Enter the second number - ");
        number2 = obj.nextInt();
        System.out.print("Enter the third number - ");
        number3 = obj.nextInt();
        obj.close();
        
        maximum=(number1>number2)?(number1>number3)?number1:number3:(number2>number3)?number2:number3;
        System.out.println("Maximum number amoung these 3 number is - "+maximum);
    }
}
