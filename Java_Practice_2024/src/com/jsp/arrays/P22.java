package com.jsp.arrays;

public class P22 {

	public static void main(String[] args) {
		int[] arr = new int[15];
		for (int i = 0; i < 15; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}

		int secondLow = secondLowest(arr);
		System.out.println("from the given array 2nd lowest is : " + secondLow);
	}

	public static int secondLowest(int[] arr) {
		int lowest = arr[0], secondLow = arr[arr.length - 1];
		for (int num : arr) {
			if (num < lowest) {
				secondLow = lowest;
				lowest = num;
			}
		}

		for (int num : arr) {
			if (num < secondLow && num != lowest) {
				secondLow = num;
			}
		}
		return secondLow;
	}
}
