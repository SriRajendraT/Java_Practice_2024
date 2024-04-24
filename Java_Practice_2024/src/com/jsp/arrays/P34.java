package com.jsp.arrays;

public class P34 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 20, 30, 30 };
		System.out.print("Actual Array : ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("Sorted Array : ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
