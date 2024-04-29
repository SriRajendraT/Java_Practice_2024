package com.jsp.collections;

import java.util.Vector;

public class P21 {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		for (int i = 1; i <= 5; i++) {
			vector.add(i);
		}

		System.out.println("Original Vector :" + vector);

		int elementToRemove = 3;

		removeElement(vector, elementToRemove);

		System.out.println("Vector after removing " + elementToRemove + ": " + vector);
	}

	public static <T> void removeElement(Vector<T> vector, T elementToRemove) {
		if (vector.contains(elementToRemove)) {
			vector.remove(elementToRemove);
			System.out.println("Element " + elementToRemove + " removed successfully");
		} else {
			System.out.println("Element " + elementToRemove + " does not exist in the Vector");
		}
	}
}
