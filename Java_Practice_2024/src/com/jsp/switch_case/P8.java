package com.jsp.switch_case;

public class P8 {

	public static void main(String[] args) {
		String monthName="January11";
		switch(monthName.toLowerCase()) {
		case "december":
		case "january":
		case "februray": System.out.println("Winter");break;
		case "march":
		case "april":
		case "may": System.out.println("Summer");break;
		case "june":
		case "july":
		case "august":System.out.println("Rainy");break;
		case "september":
		case "october":
		case "november":System.out.println("Spring");break;
		default:{
			System.out.println("enter a vaild month name '"+monthName+"' doesnt make any sense");
		}
		}
	}

}
