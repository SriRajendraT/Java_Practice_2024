package com.jsp.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class P16 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2,  4, 5));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5));

		int elementToCheck = 3;
		if (list1.contains(elementToCheck)) {
			System.out.println("List1 contains " + elementToCheck);
		} else {
			System.out.println("List1 does not contain " + elementToCheck);
		}

		if (list1.containsAll(list2)) {
			System.out.println("List1 contains all elements of List2");
		} else {
			System.out.println("List1 does not contain all elements of List2");
		}

		ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3,  5));

		if (list1.equals(list3)) {
			System.out.println("List1 and List3 are equal");
		} else {
			System.out.println("List1 and List3 are not equal");
		}
	}

}
