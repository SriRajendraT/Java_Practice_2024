package com.jsp.standard_programs;

public class P17 {

	public static void main(String[] args) {
		int num = 10;
		int num1 = 0, num2 = 1, newNum = 0;
		if (num >= 1) {
			System.out.println(num1);
		}
		if (num >= 2) {
			System.out.println(num2);
		}
		for (int i = 3; i <= num; i++) {
			newNum = num1 + num2;
			System.out.println(newNum);
			num1 = num2;
			num2 = newNum;
		}
	}

}
