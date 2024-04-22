package com.jsp.arrays;

public class P16 {

	public static void main(String[] args) {
		int[] arr = new int[15];
		int min = 14;
		for (int i = 0; i < 15; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if (min >= arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("the max element in given array is " + min);
	}

}
