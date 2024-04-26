package com.jsp.collections;

import java.util.ArrayList;

public class P1 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++) {
			arrayList.add(i);
		}

		int count = arrayList.size();

		System.out.println("the number of elements present in the given Array List " + arrayList + " are " + count);
	}

}
