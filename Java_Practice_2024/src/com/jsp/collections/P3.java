package com.jsp.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class P3 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 1; i <= 5; i++) {
			list.add(i);
		}
		System.out.println("Original Array : " + list);

		System.out.println("Printing reversed elements : ");
		lastToFirst(list);
	}

	public static <T> void lastToFirst(LinkedList<T> list) {
		ListIterator<T> iterator = list.listIterator(list.size());
		while (iterator.hasPrevious()) {
			System.out.print(iterator.previous() + " ");
		}

		System.out.println();
	}

}
