package com.jsp.strings;

public class P22 {

	public static void main(String[] args) {
		String str = "VK is the King of cricket";
		String largest = largestWord(str);
		System.out.println("the largest word in the given string '" + str + "' is '" + largest + "'");
	}

	public static String largestWord(String str) {
		String[] words = str.split(" ");

		String largest = "";

		for (String word : words) {
			if (word.length() > largest.length()) {
				largest = word;
			}
		}
		return largest;
	}

}
