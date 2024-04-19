package com.jsp.standard_programs;

public class P15 {

	public static void main(String[] args) {
		int position = 2;
		int perfectNumber = findPerfectNumber(position);
		if (perfectNumber != -1) {
			System.out.println("The perfect number at position " + position + " is: " + perfectNumber);
		} else {
			System.out.println("No perfect number found at position " + position);
		}

	}

	public static boolean checkPerfect(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum == num;
	}

	public static int findPerfectNumber(int position) {
		int count = 0;
		int number = 1;
		while (count < position) {
			if (checkPerfect(number)) {
				count++;
			}
			if (count == position) {
				return number;
			}
			number++;
		}
		return -1;
	}
}
