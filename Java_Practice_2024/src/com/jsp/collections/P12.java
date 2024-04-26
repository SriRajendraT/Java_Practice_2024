package com.jsp.collections;

import java.util.ArrayList;

public class P12 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 5; i >= 0; i--) {
			list.add(i);
		}

		System.out.println("Original Array List " + list);

		sortElement(list);

		System.out.println("Sorted Array List " + list);
	}

	public static void sortElement(ArrayList<Integer> list) {
		int length = list.size();

		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (list.get(j) > list.get(j + 1)) {
					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
	}

}
