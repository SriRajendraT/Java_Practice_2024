package com.jsp.collections;

import java.util.ArrayList;
import java.util.Collections;

public class P11 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i=5;i>=0;i--) {
			list.add(i);
		}
		
		System.out.println("Original Array List "+list);
		
		Collections.sort(list);
		
		System.out.println("Sorted Array List "+list);
	}

}
