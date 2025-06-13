package ControlFlows.level2;

import java.util.Scanner;

public class Problem8_FactorsWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        
        System.out.println("Factors of " + number + " are:");
        int counter = 1;
        while (counter <= number) {
            if (number % counter == 0) {
                System.out.println(counter);
            }
            counter++;
        }
        
        input.close();
    }
} 