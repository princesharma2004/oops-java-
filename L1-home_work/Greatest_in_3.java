/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 5/8/24 10:56 PM
    WORKING       - Greatest in three variable
*/

public class Greatest_in_3 {
    public static void main(String[] arg)
    {
        int number1=9,number2=8,number3=11;
        int largest=(number1>number2)?(number1>number3)?number1:number3:(number2>number3)?number2:number3;
        System.out.println("Largest number amoung these 3 number is - "+largest);
    }
}
