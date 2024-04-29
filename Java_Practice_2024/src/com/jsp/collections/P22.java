package com.jsp.collections;

import java.util.ArrayList;
import java.util.List;

public class P22 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				list2.add(i);
			}
			list1.add(i);
		}

		System.out.println("Original List 1 :" + list1);
		System.out.println("Original List 2 :" + list2);

		removeCommonElements(list1, list2);
		System.out.println("List 1 after removing common elements: " + list1);
	}

	public static <T> void removeCommonElements(List<T> list1, List<T> list2) {
		List<T> copyList = new ArrayList<T>(list1);

		for (T item : copyList) {
			if (list2.contains(list1)) {
				list1.remove(item);
			}
		}
	}
}
