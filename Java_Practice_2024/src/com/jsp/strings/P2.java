package com.jsp.strings;

public class P2 {

	public static void main(String[] args) {
		String str = "Rajendra";
		System.out.print("Actual String : " + str);
		System.out.println();

		char[] ch = stringToChar(str);
		System.out.print("convert String to array : ");
		for (char c : ch) {
			System.out.print(c + " ");
		}
	}

	public static char[] stringToChar(String str) {
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		return ch;
	}

}
