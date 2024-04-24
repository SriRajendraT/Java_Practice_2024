package com.jsp.strings;

public class P7 {

	public static void main(String[] args) {
		String str = "rajendra";
		char search = 'a';
		if (isPresent(str, search)) {
			System.out.println("from given string " + str + " the character " + search + " is found");
		} else {
			System.out.println("from given string " + str + " the character " + search + " is not found");
		}
	}

	public static boolean isPresent(String str, char search) {
		boolean found = false;
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			if (ch[i] == search) {
				found = true;
				break;
			}
		}
		return found;
	}
}
