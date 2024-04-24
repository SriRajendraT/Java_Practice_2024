package com.jsp.arrays;

public class P37 {

	public static void main(String[] args) {
		int[] arr = { 1, 202, 30, 40, 50, 20, 30, 30, 2, 3, 5, 121 };
		int newElement = 0;
		int index = 4;
		System.out.print("old array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		if (index < 0 || index > arr.length) {
			System.out.println("Invalid position");
			return;
		}

		int[] newArr = new int[arr.length + 1];

		for (int i = 0; i < index; i++) {
			newArr[i] = arr[i];
		}

		newArr[index] = newElement;

		for (int i = index + 1; i < newArr.length; i++) {
			newArr[i] = arr[i - 1];
		}
		System.out.println();
		System.out.print("new array: ");
		for (int num : newArr) {
			System.out.print(num + " ");
		}
	}

}
