/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 9/8/24 12:44 PM
    WORKING       - bmi calculation
*/

import java.util.Scanner;

public class Bmi_calculation {
    public static void main(String[] args) {
        int weight;
        float height, bmi;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter weight in kilograms - ");
        weight = obj.nextInt();
        System.out.print("Enter height in meters - ");
        height = obj.nextFloat();
        obj.close();

        bmi = weight / (height*height);
        System.out.print("The BMI is - "+bmi);
    }
}
