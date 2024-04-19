package com.jsp.switch_case;

public class P3 {

	public static void main(String[] args) {
		String weekName = "Sun";
		switch (weekName) {
		case "Sunday":
			System.out.println(1);
			break;
		case "Monday":
			System.out.println(2);
			break;
		case "Tuesday":
			System.out.println(3);
			break;
		case "Wednesday":
			System.out.println(4);
			break;
		case "Thursday":
			System.out.println(5);
			break;
		case "Saturday":
			System.out.println(6);
			break;
		default: {
			System.out.println("please give a valid input '" + weekName + "' doesnt make sense");
		}
		}
	}

}
