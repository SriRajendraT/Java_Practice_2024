package com.jsp.switch_case;

public class P1 {

	public static void main(String[] args) {
		char ch = 'a';
		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			switch (ch) {
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'O':
			case 'o':
			case 'u':
			case 'U':
			case 'a': {
				System.out.println("the given character '" + ch + "' is Vowel");
				break;
			}
			default: {
				System.out.println("the given character '" + ch + "' is consonent");
			}
			}
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("please enter valid character to check for Vowel or Consonent '" + ch + "' is a number");
		} else {
			System.out.println(
					"please enter valid character to check for Vowel or Consonent '" + ch + "' is a special character");
		}
	}

}
