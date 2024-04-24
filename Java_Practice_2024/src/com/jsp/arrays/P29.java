package com.jsp.arrays;

public class P29 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 20 };
		int search = 100, count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				count++;
			}
		}
		if (count != 0) {
			System.out.println("from the given array the element " + search + " is repeated " + count + " times");
		} else {
			System.out.println("from the given array the element " + search + " is not found");
		}
	}
}