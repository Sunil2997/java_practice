package com.basic;

public class RemoveSpecialCharfrpmSpring {

	public static void main(String[] args) {

		String str="@3 671SUNI LSOL(  *^%   $$^UNKE  ";
		String replaceAll = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(replaceAll);
	}

}
