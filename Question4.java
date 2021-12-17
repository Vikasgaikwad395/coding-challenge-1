package com.vkg.Question2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Question4 {
	
	private final static TreeMap<Integer, String> tm = new TreeMap< Integer, String>();

	static {
			tm.put(1000, "M");
			tm.put(900, "CM");
	        tm.put(500, "D");
	        tm.put(400, "CD");
	        tm.put(100, "C");
	        tm.put(90, "XC");
	        tm.put(50, "L");
	        tm.put(40, "XL");
	        tm.put(10, "X");
	        tm.put(9, "IX");
	        tm.put(5, "V");
	        tm.put(4, "IV");
	        tm.put(1, "I");

		}
	public final static String toRoman(int number) {
		int l = tm.floorKey(number);
		if(number == 1) {
			return tm.get(number);
		}
		return tm.get(l) + toRoman(number - l);
	}
	
	public void testRoman() {
		for(int i = 1; i <=100; i++) {
			System.out.println(i + "\t = \t" + Question4.toRoman(i));
		}
	}
}
