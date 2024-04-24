package com.jsp.strings;

public class P9 {

	public static void main(String[] args) {
		String str = "rajendra";
		int count = countVowel(str);
		System.out.println("Number of vowels in the string: " + str + " is " + count);
	}

	public static int countVowel(String str) {
		str = str.toLowerCase();

		int count = 0;
		for (char ch : str.toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}
}
