package com.jsp.collections;

import java.util.HashSet;

public class P13 {

	public static void main(String[] args) {
		HashSet<Integer> sets=new HashSet<Integer>();
		for(int i=0;i<=5;i++) {
			sets.add(i);
		}
		
		for(int set:sets) {
			System.out.println(set);
		}
		
	}

}
