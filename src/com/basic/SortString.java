package com.basic;

public class SortString {

	public static void main(String[] args) {
		String inpute="    siunidl   solgu nkefsa  dcolutioneh   ";
		//using set
		char temp;
		String str=inpute.replaceAll("[^a-zA-Z0-9]", "");
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
	
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
				}
			}
		}
		//converting char arry into string 
		System.out.println(new String(arr));

	}

}
