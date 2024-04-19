package com.jsp.standard_programs;

public class P16 {

	public static void main(String[] args) {
		int num = 123;
		if (checkArmStrong(num)) {
			System.out.println("the given number " + num + " is ArmStrong number");
		} else {
			System.out.println("the given number " + num + " is not a ArmStrong number");
		}
	}

	public static boolean checkArmStrong(int num) {
		int temp = num, totalDigits = countNum(num), result = 0, rem = 0;
		while (num != 0) {
			rem = num % 10;
			result += powerMulti(rem, totalDigits);
			num /= 10;
		}
		return result == temp;
	}

	public static int countNum(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num /= 10;
		}
		return count;
	}

	public static int powerMulti(int base, int power) {
		int product = 1;
		for (int i = 1; i <= power; i++) {
			product *= base;
		}
		return product;
	}

}
