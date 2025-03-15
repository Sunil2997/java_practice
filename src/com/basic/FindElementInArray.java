package com.basic;

public class FindElementInArray {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean flag = findElement(numbers, numbers.length, 5);
        System.out.println(flag);
    }

    private static boolean findElement(int[] numbers, int length, int key) {
        for (int i = 0; i < length; i++) {
            // Check if the key matches the current element
            if (numbers[i] == key) {
                return true;
            }
            // Optimization: Exit early if the key is less than the current element
            if (key < numbers[i]) {
                return false;
            }
        }
        return false; // Key not found
    }
}
