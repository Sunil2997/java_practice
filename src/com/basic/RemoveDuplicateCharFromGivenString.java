package com.basic;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharFromGivenString {

	public static void main(String[] arg) {
		String str="asoalunkesunilsubhashpimpawadia";
		Set<Character> set=new LinkedHashSet<>();
		StringBuilder sb=new StringBuilder();
		for(char c :str.toCharArray()) {
			if(!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}
		}
		//System.out.println(sb.toString());
		//with java 8
		StringBuilder sb1=new StringBuilder();
		str.chars().distinct().forEach(x-> sb1.append((char)x));
		//System.out.println(sb1.toString());
		//using indexOf
		StringBuilder sb2=new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			int indexOf = str.indexOf(charAt);//return first occurrence index
			//System.out.println(indexOf);
			 int indexOf2 = str.indexOf(charAt,i+1);
			 System.out.println(indexOf2);
			 if(indexOf2==-1) {
				 sb2.append(charAt);
			 }
			
		}
		System.out.println(sb2);
		

	}
}
