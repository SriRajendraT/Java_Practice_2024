package com.jsp.arrays;

public class P30 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 20, 30, 30 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == -1) {
				continue;
			}

			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = -1;
				}
			}

			if (count != 0) {
				System.out.println("From the given arr the Element " + arr[i] + " repeats " + count + " times.");

			}
		}
	}

}
