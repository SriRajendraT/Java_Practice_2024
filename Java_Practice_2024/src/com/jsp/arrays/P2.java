package com.jsp.arrays;

public class P2 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.println("elements in even index are " + arr[i]);
			}
		}
	}

}
