package com.jsp.arrays;

public class P33 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 10, 11, 12 };
		int newArrlength = arr1.length + arr2.length;
		int[] newArr = new int[newArrlength];
		
		for (int i = 0; i < arr1.length; i++) {
			newArr[i] = arr1[i];

		}
		for (int i = 0; i < arr2.length; i++) {
			newArr[arr1.length + i] = arr2[i];

		}
		for (int num : newArr) {
			System.out.println(num);
		}
	}

}
