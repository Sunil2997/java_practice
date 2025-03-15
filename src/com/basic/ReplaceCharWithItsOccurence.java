package com.basic;

public class ReplaceCharWithItsOccurence {

	public static void main(String[] args) {
		String str="solunkesunilsubhash";
		int count=1;
		for (int i = 0; i < str.length(); i++) {
			
			str=str.replaceFirst(String.valueOf('s'), String.valueOf(count));
			count++;
			
		}
		System.out.println(str);
		
	}
}
