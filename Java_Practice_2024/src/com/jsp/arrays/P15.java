package com.jsp.arrays;

public class P15 {

	public static void main(String[] args) {
		int[] arr = new int[15];
		int max = 0;
		for (int i = 0; i < 15; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if (max <= arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("the max element in given array is " + max);
	}

}
