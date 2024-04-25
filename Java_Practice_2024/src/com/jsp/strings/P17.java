package com.jsp.strings;

public class P17 {

	public static void main(String[] args) {
		String str = "rajendraisgreat";
		System.out.println("original string : " + str);
		String sub = findSubstring(str);
		System.out.println("longest substring : " + sub);
	}

	public static String findSubstring(String str) {
		int lenght = str.length();
		int max = 0;
		int start = 0;
		int[] index = new int[256];

		for (int i = 0; i < 256; i++) {
			index[i] = -1;
		}

		int left = 0;
		for (int right = 0; right < lenght; right++) {
			if (index[str.charAt(right)] != -1 && index[str.charAt(right)] >= left) {
				left = index[str.charAt(right)] + 1;
			}

			index[str.charAt(right)] = right;
			if (right - left + 1 > max) {
				max = right - left + 1;
				start = left;
			}
		}
		return str.substring(start, start + max);
	}

}
