/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 9/8/24 7:24 AM
    WORKING       - perimeter of a square
*/

import java.util.Scanner;

public class Perimeter_of_a_square {
    public static void main(String[] args) {
        int side_length, perimeter;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the side length of the square - ");
        side_length = obj.nextInt();
        obj.close();

        perimeter = 4 * side_length;
        System.out.println("The perimeter of the square is - "+perimeter);
    }
}
