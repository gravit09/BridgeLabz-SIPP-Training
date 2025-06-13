package ControlFlows.level2;

import java.util.Scanner;

public class Problem12_Power {
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
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        
        System.out.println(number + " raised to power " + power + " is: " + result);
        
        input.close();
    }
} 