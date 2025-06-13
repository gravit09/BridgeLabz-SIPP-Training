package ProgrammingElements.level1;

import java.util.Scanner;

public class Problem10_HeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height in centimeters: ");
        double heightCm = input.nextDouble();
        double heightInches = heightCm / 2.54;
        int feet = (int)(heightInches / 12);
        double inches = heightInches % 12;
        System.out.println("Your Height in cm is " + heightCm + 
                         " while in feet is " + feet + " and inches is " + inches);
        input.close();
    }
} 