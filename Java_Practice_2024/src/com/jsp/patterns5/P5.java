package com.jsp.patterns5;

public class P5 {

	public static void main(String[] args) {
		int num=5;
		for(int row =1;row<num;row++) {
			for(int col=row;col<num;col++) {
				System.out.print("_ ");
			}
			for(int col=1;col<row;col++) {
				System.out.print(row+" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print(row+" ");
			}
		System.out.println();
		}
		for(int row=num/2+1;row>=1;row--) {
			for(int col=row;col<num;col++) {
				System.out.print("_ ");
			}
			for(int col=num-row;col<=num-1;col++) {
				System.out.print(row+" ");
			}
			for(int col=num-row;col<num-1;col++) {
				System.out.print(row+" ");
			}
		System.out.println();
		}
	}

}
