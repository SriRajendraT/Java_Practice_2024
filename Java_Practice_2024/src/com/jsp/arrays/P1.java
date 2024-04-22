package com.jsp.arrays;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("please enter " + (i + 1) + " :");
			arr[i] = scanner.nextInt();
		}

		scanner.close();

		for (int i = 0; i < arr.length; i++) {
			System.out.println("the value of " + (i + 1) + " : " + arr[i]);
		}
	}

}
