package ProgrammingElements.level1;

import java.util.Scanner;

public class Problem12_TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = input.nextDouble();
        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * 6.4516; // Convert square inches to square cm
        System.out.println("The area of triangle is " + areaInches + " square inches and " + 
                         areaCm + " square centimeters");
        input.close();
    }
} 