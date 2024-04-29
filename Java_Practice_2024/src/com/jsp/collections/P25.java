package com.jsp.collections;

import java.util.HashSet;

public class P25 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		if (set.isEmpty()) {
			System.out.println("HashSet is empty, adding elements...");
			for (int i = 1; i <= 5; i++) {
				set.add(i);
			}
			System.out.println("Elements added successfully.");
		} else {
			System.out.println("HashSet is not empty.");
		}

		System.out.println("HashSet elements: " + set);
	}

}
