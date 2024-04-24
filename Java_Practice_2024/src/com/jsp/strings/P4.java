package com.jsp.strings;

public class P4 {

	public static void main(String[] args) {
		String str = "appa";
		System.out.println("actual String : " + str.toUpperCase());
		String revStr = revString(str.toUpperCase());
		System.out.println("Reversed String : " + revStr.toUpperCase());
		if (str.equalsIgnoreCase(revStr)) {
			System.out.println("the given string " + str + " is Palindrome");
		} else {
			System.out.println("the given string " + str + " is not Palindrome");
		}
	}

	public static String revString(String str) {
		char[] ch = str.toCharArray();
		int start = 0;
		int end = str.length() - 1;
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
