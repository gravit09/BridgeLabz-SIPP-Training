package ControlFlows.level2;

import java.util.Scanner;

public class Problem2_EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter employee's salary: ");
        double salary = input.nextDouble();
        
        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();
        
        double bonus = 0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }
        
        System.out.printf("Bonus amount: $%.2f%n", bonus);
        
        input.close();
    }
} 