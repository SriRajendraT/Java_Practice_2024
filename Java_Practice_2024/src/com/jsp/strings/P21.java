package com.jsp.strings;

public class P21 {

	public static void main(String[] args) {
		String sentance = "VK is King";

		String search = "raj";

		if (searchWord(sentance, search)) {
			System.out.println("from the given sentance '" + sentance + "' the word '" + search + "' is found");
		} else {
			System.out.println("from the given sentance '" + sentance + "' the word '" + search + "' is not found");
		}
	}

	public static boolean searchWord(String sentance, String search) {
		String words[] = sentance.split(" ");
		for (String word : words) {
			if (word.equalsIgnoreCase(search)) {
				return true;
			}
		}
		return false;
	}
}
