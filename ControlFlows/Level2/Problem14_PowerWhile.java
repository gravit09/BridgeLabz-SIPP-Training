package ControlFlows.level2;

import java.util.Scanner;

public class Problem14_PowerWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the base number: ");
        int number = input.nextInt();
        
        System.out.print("Enter the power: ");
        int power = input.nextInt();
        
        if (number <= 0 || power < 0) {
            System.out.println("Please enter positive numbers.");
            return;
        }
        
        int result = 1;
        int counter = 0;
        
        while (counter < power) {
            result *= number;
            counter++;
        }
        
        System.out.println(number + " raised to power " + power + " is: " + result);
        
        input.close();
    }
} 