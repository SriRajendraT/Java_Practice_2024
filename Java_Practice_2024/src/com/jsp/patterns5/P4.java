package com.jsp.patterns5;

public class P4 {

	public static void main(String[] args) {
		int num=5;
		for(int row=1;row<num-1;row++) {
			char ch='A';
			for(int col=row;col<num-1;col++) {
				System.out.print("_ ");
			}
			for(int col=1;col<row;col++) {
				System.out.print(ch+" ");
				ch++;
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(ch+" ");
				ch++;
			}
		System.out.println();
		}
	}

}
