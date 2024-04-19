package com.jsp.standard_programs;

public class P13 {

	public static void main(String[] args) {
		int position = 2;
		int count = 0;

		for (int i = 2;; i++) {
			if (checkPrime(i)) {
				count++;
				if (count == position) {
					System.out.println("the prime number at poition " + position + " is " + i);
				}
			}
		}

	}

	public static boolean checkPrime(int num) {
		int count = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		return !(count > 0);
	}

}
