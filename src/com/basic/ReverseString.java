package com.basic;

public class ReverseString {

	public static void main(String[] args) {
		String name="sunil";
		//using string buffer
		String string = new StringBuilder(name).reverse().toString();
		System.out.println(string);
		StringBuilder builder=new StringBuilder();
		for(int i=name.length()-1;i>=0;i--) {
			char charAt = name.charAt(i);
			builder.append(charAt);
			System.out.println(name.charAt(i));
		}
		System.out.println(builder);
	

	}

}
