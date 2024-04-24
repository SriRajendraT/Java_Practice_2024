package com.jsp.strings;

public class P14 {

	public static void main(String[] args) {
		String str = "VK is King";

		int word = countWords(str);
		System.out.println("number for words present in the given '" + str + "' are " + word);
	}

	public static int countWords(String str) {
		int count = 0;
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			count++;
		}
		return count;
	}

}
