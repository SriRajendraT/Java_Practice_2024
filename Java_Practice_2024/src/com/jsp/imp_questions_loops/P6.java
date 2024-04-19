package com.jsp.imp_questions_loops;

public class P6 {

	public static void main(String[] args) {
		int num = 11;
		int product = (product(num));
		if (checkEven(product)) {
			System.out.println("the product of digit from given number " + num + " is " + product + " and it is Even");
		} else {
			System.out.println("the product of digit from given number " + num + " is " + product + " and it is Odd");
		}
	}

	public static int product(int num) {
		int rem = 0, product = 1;
		while (num != 0) {
			rem = num % 10;
			product *= rem;
			num /= 10;
		}
		return product;
	}

	public static boolean checkEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
