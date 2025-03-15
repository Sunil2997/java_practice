package com.basic;

public class SomeOfNaturalNumbers {

	public static void main(String[] args) {
		int n=4;
		//for loop
		commonMethod(n);
		//using formula
		mathFormula(n);
		//using recursion
		System.out.println("using recursion  :"+sumOfUmbersWithRecursion(n));
		

	}
	
	static int sumOfUmbersWithRecursion(int number){
		if(number==0) {
			return 0;//note this
		}
		return number+sumOfUmbersWithRecursion(number-1);
		
	}

	private static void mathFormula(int n) {
		System.out.println("using formula: "+(n*(n+1)/2));
	}

	private static void commonMethod(int n) {
		
		int sum=0;
		for(int i=n;i>0;i--) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
