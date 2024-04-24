package com.jsp.strings;

public class P11 {

	public static void main(String[] args) {
		String str = "ap pa";
		int countWithoutSpaces = countCharacterWithoutSpaces(str);
		System.out.println("Number od characters in given string " + str + " without spaces is " + countWithoutSpaces);
	}

	public static int countCharacterWithoutSpaces(String str) {
		String strSpace = str.replaceAll(" ", "");
		return strSpace.length();
	}
}
