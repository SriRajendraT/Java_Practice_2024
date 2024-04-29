package com.jsp.collections;

import java.util.TreeMap;

public class P23 {

	public static void main(String[] args) {
		TreeMap<Integer, Character> list1 = new TreeMap<Integer, Character>();
		char ch = 'A';
		for (int i = 1; i <= 5; i++) {
			list1.put(i, ch);
			ch++;
		}

		System.out.println("the size of given TreeMap :" + list1 + " is " + list1.size());
	}

}
