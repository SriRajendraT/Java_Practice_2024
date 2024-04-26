package com.jsp.collections;

import java.util.LinkedList;

public class P2 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int i=1;i<=5;i++) {
			list.add(i);
		}
		
		System.out.println("Original Linked List "+list);
		
		int length=list.size();
		for(int i=0;i<length/2;i++) {
			int temp=list.get(i);
			list.set(i, list.get(length-1-i));
			list.set(length-1-i, temp);
		}
		
		System.out.println("Reversed Linked List "+list);
	}

}
