package com.jsp.arrays;

public class P23 {

	public static void main(String[] args) {
		int[] arr = new int[15];
		for (int i = 0; i < 15; i++) {
			arr[i] = i;
		}

		int searchVal = 2;

		if (valueIsPresent(searchVal, arr)) {
			System.out.println("from the given array " + searchVal + " is present");
		} else {
			System.out.println("from the given array " + searchVal + " is not present");
		}
	}

	public static boolean valueIsPresent(int searchVal, int[] arr) {
		boolean present = false;
		for (int num : arr) {
			if (num == searchVal) {
				present = true;
				break;
			}
		}
		return present;
	}
}
