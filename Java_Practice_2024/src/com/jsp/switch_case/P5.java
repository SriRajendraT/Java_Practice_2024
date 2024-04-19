package com.jsp.switch_case;

public class P5 {

	public static void main(String[] args) {
		int num = 5;
		if (num >= 1 && num <= 7) {
			switch (num) {
			case 1: {
				System.out.print("S,");
			}
			case 2: {
				System.out.print("M,");
			}
			case 3: {
				System.out.print("T,");
			}
			case 4: {
				System.out.print("W,");
			}
			case 5: {
				System.out.print("Th,");
			}
			case 6: {
				System.out.print("F,");
			}
			case 7: {
				System.out.print("S");
				break;
			}
			}
		} else {
			System.out.println("there are only 7 days in a week give a valid number");
		}
	}

}
