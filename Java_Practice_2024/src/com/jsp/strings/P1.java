package com.jsp.strings;

public class P1 {

	public static void main(String[] args) {
		char[] ch = { 'a', 'b', 'c', 'd', 'e' };
		System.out.print("Char Array: ");
		for (char c : ch) {
			System.out.print(c + " ");
		}
		System.out.println();

		String str = charToString(ch);

		System.out.print("new String: ");
		System.out.print(str);
	}

	public static String charToString(char[] ch) {
		StringBuilder str = new StringBuilder();
		for (char c : ch) {
			str.append(c);
		}
		return str.toString();
	}
}
