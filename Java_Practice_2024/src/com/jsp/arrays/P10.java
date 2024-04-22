package com.jsp.arrays;

public class P10 {

	public static void main(String[] args) {
		int[] arr = new int[15];
		for (int i = 0; i < 15; i++) {
			arr[i] = i;
		}

		for (int i = arr.length / 2; i < arr.length; i++) {
			System.out.print("the elements in 2nd half of array are ");
			System.out.println(arr[i]);
		}
	}

}
