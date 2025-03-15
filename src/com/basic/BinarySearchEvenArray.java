package com.basic;
public class BinarySearchEvenArray {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Discard left half
            } else {
                right = mid - 1; // Discard right half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 25, 30, 40, 50,60};
        int target = 25;

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}
