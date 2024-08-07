/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 7/8/24 12:11 PM
    WORKING       - Area of a Rectangle
*/

import java.util.Scanner;

public class Area_of_rectangle {
    public static void main(String[] args) {
        int length,width,area;
        
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the length - ");
        length = obj.nextInt();
        System.out.print("Enter the width - ");
        width = obj.nextInt();
        obj.close();

        area = length * width;
        System.out.println("Area of rectangle is - "+area);
    }
}
