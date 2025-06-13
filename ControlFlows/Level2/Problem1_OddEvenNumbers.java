package ControlFlows.level2;

import java.util.Scanner;

public class Problem1_OddEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        
        System.out.println("Odd and Even numbers from 1 to " + number + ":");
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
        
        input.close();
    }
} 