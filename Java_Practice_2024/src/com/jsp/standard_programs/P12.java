package com.jsp.standard_programs;

public class P12 {

	public static void main(String[] args) {
		int num = 11;
		if (checkPrime(num)) {
			System.out.println("the given number " + num + " is Prime");
		} else {
			System.out.println("the given number " + num + " is not a Prime");
		}

	}

	public static boolean checkPrime(int num) {

		int count = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return !(count>0);
	}

}
