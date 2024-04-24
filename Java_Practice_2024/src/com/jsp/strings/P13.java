package com.jsp.strings;

public class P13 {

	public static void main(String[] args) {
		String str="VK is King";
		System.out.println("Original String : "+str);
		String spaces=removeSpaces(str);
		System.out.println("New String : "+spaces);
	}

	public static String removeSpaces(String str) {
		String spaces=str.replaceAll(" ", "");
		return spaces;
	}
}
