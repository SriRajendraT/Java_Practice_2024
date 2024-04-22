package com.jsp.arrays;

public class P4 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
			arr[i] = i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum = sum + arr[i];
		}
		System.out.println("the sum of all elements in array is " + sum);
	}

}
