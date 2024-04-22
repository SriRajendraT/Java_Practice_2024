package com.jsp.arrays;

public class P20 {

	public static void main(String[] args) {
		int[] arr = new int[15];
		int sum = 0;
		double avg;
		int count = 0;
		for (int i = 0; i < 15; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			count++;
		}

		avg = sum / count;
		System.out.println("the avg of given elements in array is " + avg);
	}

}
