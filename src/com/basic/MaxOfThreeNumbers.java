package com.basic;

public class MaxOfThreeNumbers {

	public static void main(String[] args) {
		
		int a=1000;
		int b=30;
		int c=200;
		//comparative operator
		sumOfThreeWithJava8(a, b, c);

	}

	private static void sumOfThreeWithJava8(int a, int b, int c) {
		int max=(a>b && a>c)?a:(b>c)?b:c;
		System.out.println(max);
	}

}
