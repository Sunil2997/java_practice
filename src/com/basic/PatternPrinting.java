package com.basic;

public class PatternPrinting {

	public static void main(String[] args) {
		int n=3;
		//getQubePattern(n);
		
//		getFullParamidPattern(n);
//		*
//		**
//		***
//		****
//		*****

	}
	

	private static void getFullParamidPattern(int n) {
		
		for(int r=1;r<=2*n-1;r++) {
			
			for(int c=1;c<=r;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private static void getQubePattern(int n) {
		for(int r=1;r<=n;r++) {
			for(int c=1;c<=n;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
