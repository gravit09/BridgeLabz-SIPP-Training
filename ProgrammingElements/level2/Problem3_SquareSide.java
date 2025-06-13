package ProgrammingElements.level2;

import java.util.Scanner;

public class Problem3_SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter perimeter of square: ");
        double perimeter = input.nextDouble();
        
        double side = perimeter / 4;
        
        System.out.println("The length of the side is " + side + 
                         " whose perimeter is " + perimeter);
        
        input.close();
    }
} 