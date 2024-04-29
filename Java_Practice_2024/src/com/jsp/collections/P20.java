package com.jsp.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class P20 {

	public static void main(String[] args) {
		ArrayList<Character> olist=new ArrayList<Character>();
		char ch='A';
		for(int i=0;i<=5;i++) {
			olist.add(ch);
			ch++;
		}
		
		printArrayListUsingListIterator(olist);
	}
	public static void printArrayListUsingListIterator(ArrayList<Character> list) {
		ListIterator<Character> iterator=list.listIterator();
		System.out.println("Elements of the ArrayList using ListIterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
	}
}
