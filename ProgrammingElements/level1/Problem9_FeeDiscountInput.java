package ProgrammingElements.level1;

import java.util.Scanner;

public class Problem9_FeeDiscountInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student fee: ");
        int userFee = input.nextInt();
        System.out.print("Enter discount percentage: ");
        int userDiscountPercent = input.nextInt();
        double userDiscount = (userFee * userDiscountPercent) / 100.0;
        double userFinalFee = userFee - userDiscount;
        System.out.println("The discount amount is INR " + userDiscount + 
                         " and final discounted fee is INR " + userFinalFee);
        input.close();
    }
} 