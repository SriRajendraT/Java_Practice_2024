package com.jsp.arrays;

public class P7 {

	public static void main(String[] args) {
		int[] arr = new int[15];
		int sum = 0;
		for (int i = 0; i < 15; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				System.out.println(arr[i]);
				sum += arr[i];
			}
		}

		System.out.println("the sum of elements in odd index is " + sum);
	}

}
