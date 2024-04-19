package com.jsp.switch_case;

public class P6 {

	public static void main(String[] args) {
		int num=3;
		if(num>=1 && num<=12) {
			switch(num) {
			case 2:System.out.println("29 days");break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:System.out.println("31 days");break;
			case 4:
			case 6:
			case 9:
			case 11:System.out.println("30 days");break;
			}
		}else {
			System.out.println("We have only 12 months in a year enter valid number");
		}
	}

}
