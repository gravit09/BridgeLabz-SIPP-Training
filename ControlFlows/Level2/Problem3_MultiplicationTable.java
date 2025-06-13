package ControlFlows.level2;

import java.util.Scanner;

public class Problem3_MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        System.out.println("Multiplication table for " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.printf("%d * %d = %d%n", number, i, number * i);
        }
        
        input.close();
    }
} 