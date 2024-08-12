/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 12/8/24 08:53 AM
    WORKING       - scanner class simulate
*/

import java.util.*;

class Scanner_class
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a - ");
        int a = sc.nextInt();
        System.out.println("The value of a is - "+a);

        System.out.print("Enter the value of b - ");
        byte b = sc.nextByte();
        System.out.println("The value of b is - "+b);

        System.out.print("Enter the value of c - ");
        long c = sc.nextLong();
        System.out.println("The value of c is - "+c);

        System.out.print("Enter the value of d - ");
        short d = sc.nextShort();
        System.out.println("The value of d is - "+d);

        System.out.print("Enter the value of e - ");
        short e = sc.nextShort();
        System.out.println("The value of e is - "+e);

        System.out.print("Enter the value of f - ");
        boolean f = sc.nextBoolean();
        System.out.println("The value of f is - "+f);

        System.out.print("Enter the value of g - ");
        float g = sc.nextFloat();
        System.out.println("The value of g is - "+g);

        System.out.print("Enter the value of h - ");
        double h = sc.nextDouble();
        System.out.println("The value of h is - "+h);

        System.out.print("Enter the value of i - ");
        char i = sc.next().charAt(0);
        System.out.println("The value of i is - "+i);

        System.out.print("Enter the value of j - ");
        String j = sc.next();
        System.out.println("The value of j is - "+j);

        sc.close();
    }
}
