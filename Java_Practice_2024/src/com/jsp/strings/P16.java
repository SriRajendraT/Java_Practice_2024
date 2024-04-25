package com.jsp.strings;

public class P16 {

	public static void main(String[] args) {
		String str = "appa";
		System.out.println("Original String : " + str);

		String noDup = removeDuplicates(str);
		System.out.println("String with No Duplicates " + noDup);
	}

	public static String removeDuplicates(String str) {
		char[] ch = str.toCharArray();
		boolean[] repeated = new boolean[256];
		StringBuilder unrepeatedStr = new StringBuilder();

		for (char c : ch) {
			if (!repeated[c]) {
				unrepeatedStr.append(c);
				repeated[c] = true;
			}
		}

		return unrepeatedStr.toString();
	}
}
