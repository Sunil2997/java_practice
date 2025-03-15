package com.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFrequencyOfCharactorsWithMaxCount {

	public static void main(String[] args) {
		String str= "Auto generated method stub";
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0; i<str.length();i++) {
			char c = str.charAt(i);
//			if(!map.containsKey(c)) {
//				map.put(c, 1);
//			}else {
//				map.put(c,map.get(c)+1);
//			}
			 if (c != ' ') {
	                map.put(c, map.getOrDefault(c, 0) + 1);
	            }
		}
		System.out.println(map);
		int temp=0;
		char max = 0;
		for(Entry<Character, Integer> entry: map.entrySet()) {
			if(temp<entry.getValue()) {
				temp=entry.getValue();
				max=entry.getKey();
			}
		}
        System.out.println("Character with maximum frequency: '" + max + "' with count: " + temp);

	}

}
