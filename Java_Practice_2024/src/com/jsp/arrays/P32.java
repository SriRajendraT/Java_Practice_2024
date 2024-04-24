package com.jsp.arrays;

public class P32 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 20, 30, 30 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean repeated = false;
			for (int j = 0; j < count; j++) {
				if (arr[i] == arr[j]) {
					repeated = true;
					break;
				}
			}
			if (!repeated) {
				arr[count] = arr[i];
				count++;
			}
		}
		int[] newArr = new int[count];
		for (int i = 0; i < count; i++) {
			newArr[i] = arr[i];
		}

		for (int num : newArr) {
			System.out.println("Array without duplicates " + num);
		}
	}

}
