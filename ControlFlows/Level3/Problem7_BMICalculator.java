package ControlFlows.level3;

import java.util.Scanner;

public class Problem7_BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();
        
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();
        
        double heightInMeters = height / 100;
        double bmi = weight / (heightInMeters * heightInMeters);
        
        System.out.printf("BMI: %.2f\n", bmi);
        
        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi < 25) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi < 30) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }
        
        input.close();
    }
} 