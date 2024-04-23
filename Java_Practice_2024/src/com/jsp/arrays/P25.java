package com.jsp.arrays;

public class P25 {

	public static void main(String[] args) {
		int[] arr = new int[15];
		int max = 0;
		for (int i = 0; i < 15; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				System.out.println(arr[i]);
				if (max <= arr[i]) {
					max = arr[i];
				}
			}

		}
		System.out.println("the max element in odd index of given array is " + max);
	}

}
