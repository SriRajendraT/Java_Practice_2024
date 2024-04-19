package com.jsp.switch_case;

public class P4 {

	public static void main(String[] args) {
		int num = 3;
		if (num >= 1 && num <= 7) {
			switch (num) {
			case 1: {
				System.out.println("Sunday is not a working day");
				break;
			}
			case 2: {
				System.out.println("Monday is a working day");
				break;
			}
			case 3: {
				System.out.println("Tuesday is a working day");
				break;
			}
			case 4: {
				System.out.println("Wednesday is a working day");
				break;
			}
			case 5: {
				System.out.println("Thursday is a working day");
				break;
			}
			case 6: {
				System.out.println("Friday is a working day");
				break;
			}
			case 7: {
				System.out.println("Saturday is not a working day");
				break;
			}
			}
		} else {
			System.out.println("there are only 7 days in a week give a valid number");
		}
	}

}
