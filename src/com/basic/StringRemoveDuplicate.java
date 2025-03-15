package com.basic;

import java.util.LinkedHashSet;
import java.util.*;

public class StringRemoveDuplicate {

	public static void main(String[] args) {
		String inpute="    siunidl   solgu nkefsa  dcolutioneh   ";
		//using set
		String str=inpute.replaceAll("[^a-zA-Z0-9]", "");
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		System.out.println(str);
		LinkedHashSet<Character> set=new LinkedHashSet();
		StringBuilder sb=new StringBuilder();
		StringBuilder sb1=new StringBuilder();
		Arrays.sort(str.toCharArray());
		for(char c:charArray) {
			Arrays.sort(str.toCharArray());
			if(!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}
		}
		System.out.println(sb);
		//using java 8
		str.chars().distinct().forEach(c-> sb1.append((char)c));
		System.out.println(sb1);
		

	}

}
