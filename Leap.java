import java.io.*;
import java.util.Scanner;
public class leap {
    public static void main(String[] args)
    {
        int year;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a year");
        year = scn.nextInt();
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " : Leap Year");
        }
        else {
            System.out.println(year + " : Non - Leap Year");
        }
    }
}