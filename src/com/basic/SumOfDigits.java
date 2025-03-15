package com.basic;

public class SumOfDigits {

    public static void main(String[] args) {
        int number = 715; // Example 1: Input number for arithmetic-based calculation
        String str = "715"; // Example 2: Input number as a string

        // Example 1: Using arithmetic operations to calculate the sum of digits
        int sum1 = 0; // Initialize sum to 0
        for (int i = number; i > 0; i /= 10) {
            sum1 += i % 10; // Add the last digit to the sum
        }
        System.out.println("Sum of digits (Arithmetic Method): " + sum1);

        // Example 2: Using a String to calculate the sum of digits
        int sum2 = 0; // Initialize sum to 0
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i); // Get each character
            sum2 += charAt - '0';  // Add the numeric value after offset correction
        }
        System.out.println("Sum of digits (String Method): " + sum2);
    }
}
