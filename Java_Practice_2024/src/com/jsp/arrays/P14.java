package com.jsp.arrays;

public class P14 {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;
		int count = 0;
		int[] arr = new int[15];

		for (int i = 0; i < 15; i++) {
			arr[i] = i;
		}

		for (int i = arr.length / 2; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum += arr[i];
			count++;
		}
		avg = (double) sum / count;
		System.out.println("the avg of elements in 2nd half of array is " + avg);
	}

}
