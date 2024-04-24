package com.jsp.arrays;

public class P35 {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 20, 30, 40, 50, 20, 30, 30, 2, 3, 5 };
		for (int num : arr) {
			if (num != 0 && isPrime(num)) {
				System.out.println(num);
			}
		}
	}

	public static boolean isPrime(int num) {
		int count = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return !(count > 0);
	}
}
