package com.jsp.patterns5;

public class P7 {

	public static void main(String[] args) {
		int num=5;
		for(int row=1;row<num;row++) {
			for(int col=1;col<row;col++) {
				System.out.print("_ ");
			}
			for(int col=1;col<num-row;col++) {
				System.out.print(col+" ");
			}
			for(int col=num-row;col>=1;col--) {
				System.out.print(col+" ");
			}
		System.out.println();
		}
	}

}
