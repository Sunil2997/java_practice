package com.basic;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		int number=19;
		int count=0;
		for(int i=number-1;i>1;i--) {
			if(number%i==0) {
				count++;
			}
			
		}
		if(count>0) {
			System.out.println("not primber number :"+ number);
		}else {
			System.out.println(" primber number true :"+ number);
		}

	}

}
