package com.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SortStringAlphabetically {

	public static void main(String[] args) {

		String str = "solunkesunilsubhash";
		// approach 1 with arrays sort metho
		char[] charArray = str.toCharArray();
		//Arrays.sort(charArray);
		// System.out.println(charArray);
		
		 //without sort method
		 char temp;
		 for (int i = 0; i < charArray.length; i++) {
			 for (int j = i+1; j < charArray.length; j++) {
				 if(charArray[i]<charArray[j]) {
					 temp=charArray[i];
					 charArray[i]=charArray[j];
					 charArray[j]=temp;
				 }
				
			}
			
		}System.out.println(charArray);
	

	}

}
