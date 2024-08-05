/*
    AUTHOR        - PRINCE SHARMA
    DATE AND TIME - 5/8/24 10:56 PM
    WORKING       - Grade chacking program
*/

public class Grade {
    public static void main(String[] args) 
    {
        String grades[]={"O", "A+", "A", "B+", "B", "C", "P"},grade;
        int percentage=81;
        if(percentage>39) grade=grades[9-(percentage-1)/10];
        else grade="F";
        System.out.println("your percentage - "+percentage+" and your grde is - "+grade);
    }
}
