package com.jsp.arrays;

public class P11 {

	public static void main(String[] args) {
		int[] arr = new int[15];
		int sum = 0;
		double avg = 0;
		int count = 0;
		for (int i = 0; i < 15; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.println(arr[i]);
				sum += arr[i];
				count++;
			}
		}
		avg = (double) sum / count;
		System.out.println("the avg of elements in even index is " + avg);
	}

}
