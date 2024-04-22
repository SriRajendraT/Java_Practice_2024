package com.jsp.arrays;

public class P3 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				System.out.println("Elements in odd index are " + arr[i]);
			}
		}
	}

}
