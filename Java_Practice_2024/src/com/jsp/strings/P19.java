package com.jsp.strings;

public class P19 {

	public static void main(String[] args) {
		String str = "Rajendra";
		System.out.println("Original String : " + str);
		String remVow = removeVowels(str);
		System.out.println("No Vowels String : " + remVow);
	}

	public static String removeVowels(String str) {
		str = str.replaceAll("[aeiouAEIOU]", "");
		return str;
	}
}
