package com.jsp.arrays;

public class P9 {

	public static void main(String[] args) {
		int[] arr = new int[15];
		for (int i = 0; i < 15; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < arr.length / 2; i++) {
			System.out.print("the elements in 1st half for the given array is :");
			System.out.println(arr[i]);
		}
	}

}
