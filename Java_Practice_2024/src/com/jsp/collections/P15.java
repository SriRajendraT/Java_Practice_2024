package com.jsp.collections;

import java.util.ArrayList;
import java.util.Collections;

public class P15 {

	public static void main(String[] args) {
		ArrayList<Integer> oList = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			oList.add(i);
		}
		System.out.println("Original Array List :" + oList);
		swap(oList, 2, 4);

		System.out.println("Swapped Array List :" + oList);
	}

	public static <T> void swap(ArrayList<T> list, int index1, int index2) {
		if (index1 < 0 || index1 >= list.size() || index2 < 0 || index2 >= list.size()) {
			System.out.println("Invalid indices provided");
			return;
		}
		Collections.swap(list, index1, index2);
	}

}
