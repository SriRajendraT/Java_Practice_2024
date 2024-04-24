package com.jsp.arrays;

public class P40 {

	public static void main(String[] args) {
		int[] arr = { 1, 202, 30, 40, 50, 20, 30, 30, 2, 3, 5, 121 };

		System.out.print("old array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		selectionSort(arr);
		System.out.println();
		System.out.print("sorted array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static void selectionSort(int[] arr) {
		int length = arr.length;
		for (int i = 0; i < length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
	}
}
