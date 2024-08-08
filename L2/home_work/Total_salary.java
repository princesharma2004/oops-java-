/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 8/8/24 11:27 PM
    WORKING       - Total salary
*/

import java.util.Scanner;

public class Total_salary {
    public static void main(String[] args) {
        int hourly_wage, hours_worked, total_salary;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter hourly wage - ");
        hourly_wage = obj.nextInt();
        System.out.print("Enter hours worked - ");
        hours_worked = obj.nextInt();
        obj.close();

        total_salary = hourly_wage * hours_worked;
        System.out.print("The total salary is - "+total_salary);
    }
}
