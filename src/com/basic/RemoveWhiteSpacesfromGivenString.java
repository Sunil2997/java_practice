package com.basic;

public class RemoveWhiteSpacesfromGivenString {

	public static void main(String[] args) {
		String str="  sunil solunke pimpalwadis   ";
		System.out.println(str.trim());
		String trimString = str.trim();
//		String replaceAll = trimString.replaceAll("s", "");
//		System.out.println(replaceAll);
		
		//approac 1
//		String replaceAll1 = trimString.replaceAll(" ", "");
//		System.out.println(replaceAll1);
		//approach2
		String replaceAll2 = str.replaceAll("\\s", "");//trim+ whitespaces both will remove
		
		System.out.println(replaceAll2);
	

	}

}
