package com.jsp.if_else;

public class P7 {

	public static void main(String[] args) {
		char ch='0';
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
			System.out.println("the given character '"+ch+"' is an Alphabet");
		}
		else if(ch>='0' && ch<='9') {
			System.out.println("the given character '"+ch+"' is a number");
		}
		else {
			System.out.println("the given character '"+ch+"' is a special character");
		}
	}

}
