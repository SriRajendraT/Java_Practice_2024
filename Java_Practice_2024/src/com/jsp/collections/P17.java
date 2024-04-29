package com.jsp.collections;

import java.util.ArrayList;
import java.util.List;

public class P17 {

	public static void main(String[] args) {
		ArrayList<Integer> oList = new ArrayList<Integer>();
		for (int i = 1; i <= 5; i++) {
			oList.add(i);
		}

		System.out.println("Original List :" + oList);

		int startIndex = 1;
		int endIndex = 3;

		printPortion(oList, startIndex, endIndex);
	}

	public static <T> void printPortion(ArrayList<T> list, int startIndex, int endIndex) {
		if (startIndex < 0 || startIndex >= list.size() || endIndex < 0 || endIndex >= list.size()
				|| startIndex > endIndex) {
			System.out.println("Invalid indices provided");
			return;
		}

		List<T> portion = list.subList(startIndex, endIndex + 1);

		System.out.println("Portion of ArrayList from index " + startIndex + " to index " + endIndex + ": " + portion);
	}
}
