package com.basic;

public class ArrayMinMAx {

	public static void main(String[] args) {
		int[] arrayInt = { -21, 1, 5, 1, 7, 8, 2, 3, 5, 6,-10,0 };
		int size = arrayInt.length;
		int max = findMax(arrayInt, size);
		System.out.println(max);
	}

	private static int findMax(int[] arrayInt, int size) {
		int max = arrayInt[0];
		for (int i = 0; i < size; i++) {
			if (max > arrayInt[i]) {
				max = arrayInt[i];
			}
		}
		return max;
	}

}
