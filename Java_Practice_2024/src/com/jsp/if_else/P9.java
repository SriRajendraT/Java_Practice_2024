package com.jsp.if_else;

public class P9 {

	public static void main(String[] args) {
		int num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5;
		int max = num1;
		if (num2 > max) {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
		}
		if (num4 > max) {
			max = num4;
		}
		if (num5 > max) {
			max = num5;
		}
		System.out.println("from the given number " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + " and " + num5
				+ " the largest is " + max);
	}

}
