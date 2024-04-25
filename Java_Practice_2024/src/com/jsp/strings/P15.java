package com.jsp.strings;

public class P15 {

	public static void main(String[] args) {
		String str = "VK is KING";
		System.out.println("Original String : " + str);
		String rev = revWordInSentance(str);
		System.out.println("Reversed String : " + rev);
	}

	public static String revWordInSentance(String sentence) {
		String[] words = sentence.split(" ");
		StringBuilder rev = new StringBuilder();
		for (String word : words) {
			String revWord = revWord(word);
			rev.append(revWord).append(" ");
		}
		return rev.toString();
	}

	public static String revWord(String word) {
		char[] ch = word.toCharArray();
		int start = 0;
		int end = ch.length - 1;
		while (start < end) {
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;

		}
		return new String(ch);
	}
}
