package com.basic;

public class FactorialOfAnyNumber {
    public static void main(String[] args) {
        int number = -1;

        if (number < 0) {
            System.out.println("Not a valid number: " + number);
        } else {
            // Using iteration
            factorialOfNumber(number);

            // Using recursion
            int value = factorialUsingRecursion(number);
            System.out.println("Using recursion, factorial is: " + value);
        }
    }

    // Recursive method to calculate factorial
    private static int factorialUsingRecursion(int number) {
        if (number == 0 || number == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return number * factorialUsingRecursion(number - 1);
    }

    // Iterative method to calculate factorial
    private static void factorialOfNumber(int number) {
        int factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial *= i;
        }
        System.out.println("Using iteration, factorial is: " + factorial);
    }
}
