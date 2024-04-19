package com.jsp.switch_case;

public class P2 {

	public static void main(String[] args) {
		int num = 5;
		if (num >= 1 && num <= 7) {
			switch (num) {
			case 1: {
				System.out.println("Sunday");
				break;
			}
			case 2: {
				System.out.println("Monday");
				break;
			}
			case 3: {
				System.out.println("Tuesday");
				break;
			}
			case 4: {
				System.out.println("Wednesday");
				break;
			}
			case 5: {
				System.out.println("Thursday");
				break;
			}
			case 6: {
				System.out.println("Friday");
				break;
			}
			case 7: {
				System.out.println("Saturday");
				break;
			}
			}
		} else {
			System.out.println("there are only 7 days in a week give a valid number");
		}
	}

}
