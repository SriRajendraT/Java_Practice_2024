package com.jsp.arrays;

public class P36 {

	public static void main(String[] args) {
		int[] arr = { 1, 202, 30, 40, 50, 20, 30, 30, 2, 3, 5, 121 };
		for (int num : arr) {
			if (isPalindrome(num)) {
				System.out.println(num);
			}
		}
	}

	public static boolean isPalindrome(int num) {
		int temp = num, rev = 0, rem = 0;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		return temp == rev;
	}

}
