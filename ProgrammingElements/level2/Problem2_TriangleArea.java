package ProgrammingElements.level2;

import java.util.Scanner;

public class Problem2_TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter base of triangle (in cm): ");
        double base = input.nextDouble();
        
        System.out.print("Enter height of triangle (in cm): ");
        double height = input.nextDouble();
        
        // Calculate area in square centimeters
        double areaCm = 0.5 * base * height;
        
        // Convert to square inches (1 inch = 2.54 cm, so 1 sq inch = 6.4516 sq cm)
        double areaInches = areaCm / 6.4516;
        
        System.out.println("The Area of the triangle in sq in is " + areaInches + 
                         " and sq cm is " + areaCm);
        
        input.close();
    }
} 