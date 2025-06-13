package ControlFlows.level2;

import java.util.Scanner;

public class Problem13_MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive number less than 100: ");
        int number = input.nextInt();
        
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive number less than 100.");
            return;
        }
        
        System.out.println("Multiples of " + number + " below 100:");
        int counter = 100;
        while (counter >= 1) {
            if (counter % number == 0) {
                System.out.println(counter);
            }
            counter--;
        }
        
        input.close();
    }
} 