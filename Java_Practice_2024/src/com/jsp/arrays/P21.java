package com.jsp.arrays;

public class P21 {

	public static void main(String[] args) {
		int[] arr = new int[15];
		for (int i = 0; i < 15; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		int second = secondHighest(arr);
		System.out.println("from the the given arr second highest is " + second);
	}

	public static int secondHighest(int[] arr) {
		int highest = arr[0], secondHigh = arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>highest) {
//				secondHigh=highest;
//				highest=arr[0];
//			}else if(arr[i]>secondHigh && arr[i] !=highest) {
//				secondHigh=arr[i];
//			}
//		}
		for (int num : arr) {
			if (num > highest) {
				highest = num;
			}
		}

		for (int num : arr) {
			if (num > secondHigh && num != highest) {
				secondHigh = num;
			}
		}

		return secondHigh;
	}
}