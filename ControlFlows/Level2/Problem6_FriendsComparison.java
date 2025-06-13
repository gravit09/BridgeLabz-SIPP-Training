package ControlFlows.level2;

import java.util.Scanner;

public class Problem6_FriendsComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input for Amar
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        double amarHeight = input.nextDouble();
        
        // Input for Akbar
        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        double akbarHeight = input.nextDouble();
        
        // Input for Anthony
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        double anthonyHeight = input.nextDouble();
        
        // Find youngest
        int youngestAge = Math.min(Math.min(amarAge, akbarAge), anthonyAge);
        String youngest = "";
        if (youngestAge == amarAge) youngest = "Amar";
        else if (youngestAge == akbarAge) youngest = "Akbar";
        else youngest = "Anthony";
        
        // Find tallest
        double tallestHeight = Math.max(Math.max(amarHeight, akbarHeight), anthonyHeight);
        String tallest = "";
        if (tallestHeight == amarHeight) tallest = "Amar";
        else if (tallestHeight == akbarHeight) tallest = "Akbar";
        else tallest = "Anthony";
        
        System.out.println("Youngest friend is " + youngest + " with age " + youngestAge);
        System.out.println("Tallest friend is " + tallest + " with height " + tallestHeight + " cm");
        
        input.close();
    }
} 