package com.jsp.standard_programs;

import java.util.Scanner;

public class P18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the number this where you want series to be printed : ");
		int num = scanner.nextInt();
		System.out.print("Enter the first number : ");
		int num1 = scanner.nextInt();
		System.out.print("Enter the second number : ");
		int num2 = scanner.nextInt();
		int newNum = 0;
		if (num >= 1) {
			System.out.print(num1 + " , ");
		}
		if (num >= 2) {
			System.out.print(num2 + " , ");
		}
		for (int i = 3; i <= num; i++) {
			newNum = num1 + num2;
			if (i == num) {
				System.out.print(newNum + " . ");
			} else {
				System.out.print(newNum + " , ");
			}
			num1 = num2;
			num2 = newNum;
		}
		scanner.close();
	}

}
