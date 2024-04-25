package com.jsp.strings;

public class P18 {

	public static void main(String[] args) {
		String str = "Raja";
		char search = 'n';

		int index = indexOfString(search, str);

		if (index != -1) {
			System.out.println("from the given string '" + str + "' the character '" + search
					+ "' is present in index of " + index);
		} else {
			System.out.println("from the given string '" + str + "' the character '" + search + "' is not found");
		}
	}

	public static int indexOfString(char search, String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == search) {
				return i;
			}
		}
		return -1;
	}
}
