/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 7/8/24 11:58 PM
    WORKING       - Area of a Rectangle
*/

import java.util.Scanner;

public class Area_of_rectangle {
    public static void main(String[] args) {
        int length,width,area;
        
        Scanner obj = new Scanner(Scanner.in);
        System.out.print("Enter the length - ");
        length = obj.nextInt();
        System.out.print("Enter the width - ");
        width = obj.nextInt();

        area = length * width;
        System.out.println("Area of rectangle is - "+area);
    }
}
