package com.jsp.strings;

public class P10 {

	public static void main(String[] args) {
		String str = "appa";
		int count=countCharacter(str);
		System.out.println("number of character present in "+str+" is "+count);
	}
	
	public static int countCharacter(String str) {
		str=str.toLowerCase();
		int count=0;
		
		for(char ch:str.toCharArray()) {
			count++;
			System.out.print(ch+" ");
		}
		
		return count;
	}
}
