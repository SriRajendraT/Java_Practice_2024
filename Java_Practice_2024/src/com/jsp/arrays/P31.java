package com.jsp.arrays;

public class P31 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 7, 10 };
		int missing = arr[0];
		for (int i = 0; i < arr.length; i++) {
			while (missing < arr[i]) {
				System.out.println(missing);
				missing++;
			}
			missing++;
		}
	}

}
