package com.jsp.if_else;

public class P6 {

	public static void main(String[] args) {
		char ch='A';
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
			System.out.println("the given character "+ch+" is an Alphabet");
		}else {
			System.out.println("the given character "+ch+" is not an Alphabet");
		}
	}

}
