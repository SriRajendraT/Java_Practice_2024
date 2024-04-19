package com.jsp.standard_programs;

public class P7 {

	public static void main(String[] args) {
		int num = 2;
		if (isPerfectNumber(num)) {
			System.out.println("the given number " + num + " is a perfect number.");
		} else {
			System.out.println("the given number " + num + " is not a perfect number.");
		}
	}

	public static boolean isPerfectNumber(int num) {
		if (num <= 1) {
			return false;
		}

		int sum = 1;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				sum += i;
				if (i * i != num) {
					sum += num / i;
				}
			}
		}

		return sum == num;
	}
}
