package com.jsp.arrays;

public class P6 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.println(arr[i]);
				sum += arr[i];
			}
		}

		System.out.println("the sum of elements in even index is " + sum);
	}

}
