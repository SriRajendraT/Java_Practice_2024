package com.jsp.patterns5;

public class P4 {

	public static void main(String[] args) {
		int num=5;
		for (int row = 1; row <= num/2+1; row++) {
			char ch='A';
			for (int col = 1; col <= num - row; col++) {
				System.out.print("_ ");
			}
			for (int col = 1; col <= row*2-1; col++) {
				System.out.print(ch+" ");
				
			}
			System.out.println();
		}

		for (int row = num /2 ; row >= 1; row--) {
			char ch='A';
			for (int col = 1; col <= num - row; col++) {
				System.out.print("_ ");
			}
			for (int col = 1; col <= row*2-1; col++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

}
